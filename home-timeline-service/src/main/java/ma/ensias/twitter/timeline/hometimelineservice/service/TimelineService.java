package ma.ensias.twitter.timeline.hometimelineservice.service;


import ma.ensias.twitter.timeline.hometimelineservice.Repository.TimelineRepository;
import ma.ensias.twitter.timeline.hometimelineservice.Repository.TweetInfoRepository;
import ma.ensias.twitter.timeline.hometimelineservice.Repository.TweetRepository;
import ma.ensias.twitter.timeline.hometimelineservice.dto.ResponseFile;
import ma.ensias.twitter.timeline.hometimelineservice.entity.Ad;
import ma.ensias.twitter.timeline.hometimelineservice.entity.TimelineQueue;
import ma.ensias.twitter.timeline.hometimelineservice.entity.Tweet;
import ma.ensias.twitter.timeline.hometimelineservice.entity.TweetInfo;
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

    private final String baseUrl = "http://ad-service/";

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

        ResponseFile responseFile = new ResponseFile();
        responseFile.setAds(listofAds);
        responseFile.setTweets(listOfTweets);
        return responseFile;
    }

    public List<Ad> getAds(Long userId){
        Mono<Ad[]> response = webClientBuilder.baseUrl(baseUrl)
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

}
