package ma.ensias.twitter.timeline.usertimelineservice.service;

import ma.ensias.twitter.timeline.usertimelineservice.Repository.TweetRepository;
import ma.ensias.twitter.timeline.usertimelineservice.dto.ResponseFile;
import ma.ensias.twitter.timeline.usertimelineservice.entity.Ad;
import ma.ensias.twitter.timeline.usertimelineservice.entity.Tweet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class TweetService {

    @Autowired
    TweetRepository tweetRepository;

    @Autowired
    private WebClient.Builder webClientBuilder;

    private final String baseUrl = "http://ad-service/";

    public ResponseFile getUserTimeline(Long userId){
        List<Tweet> listOfUserTweets = tweetRepository.findAllTweetsById(userId);
        List<Ad> listofAds = getAds(userId);
        ResponseFile responseFile = new ResponseFile();
        responseFile.setTweets(listOfUserTweets);
        responseFile.setAds(listofAds);
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
