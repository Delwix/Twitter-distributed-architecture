package ma.ensias.twitter.timeline.hometimelineservice.service;


import ma.ensias.twitter.timeline.hometimelineservice.Repository.TimelineRepository;
import ma.ensias.twitter.timeline.hometimelineservice.Repository.TweetInfoRepository;
import ma.ensias.twitter.timeline.hometimelineservice.Repository.TweetRepository;
import ma.ensias.twitter.timeline.hometimelineservice.dto.ResponseFile;
import ma.ensias.twitter.timeline.hometimelineservice.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TimelineService {

    @Autowired
    TweetRepository tweetRepository;

    @Autowired
    TimelineRepository timelineRepository;

    @Autowired
    private WebClient.Builder webClientBuilder;

    private final String adServiceUrl = "http://ad-service/";
    private final String recommendationServiceUrl = "http://recommendation-service/";
    public ResponseFile getUserHomeTimeline(Long userId){
        //Loading ads
        List<Ad> listofAds = getAds(userId);
        Tweet tweet = new Tweet();
        TimelineQueue timelineQueue = timelineRepository.findTimelineQueueByUserId(userId);

        List<Tweet> listOfTweets = new ArrayList<>();
        for(TweetInfo u: timelineQueue.getTweetInfoList()){
            tweet.setTweetId(u.getTweetId());
            tweet.setText(tweetRepository.getById(u.getTweetId()).getText());
            tweet.setUserId(u.getUserId());
            listOfTweets.add(tweet);
        }

        Recommendation recommendation = getRecommendation(userId);

        try{
            for(Long u: recommendation.getListTweetIds()){
                Tweet tweet1 = tweetRepository.findById(u).get();
                listOfTweets.add(tweet1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }



        ResponseFile responseFile = new ResponseFile();
        responseFile.setAds(listofAds);
        responseFile.setTweets(listOfTweets);
        return responseFile;
    }

    public List<Ad> getAds(Long userId){
        Mono<Ad[]> response = webClientBuilder.baseUrl(adServiceUrl)
                .build()
                .get()
                .uri("ads/"+userId)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Ad[].class).log();
        List<Ad> out = Arrays.asList(response.block());
        System.out.println(out.toString());
        return out;
    }

    public Recommendation getRecommendation(Long userId){
        Mono<Recommendation> response = webClientBuilder.baseUrl(recommendationServiceUrl)
                .build()
                .get()
                .uri("recommendations/"+userId)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Recommendation.class).log();
        Recommendation out = response.block();
        return out;
    }

}
