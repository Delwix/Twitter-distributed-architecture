package com.twitter.tweetpost.controller;

import com.twitter.tweetpost.entity.TweetPost;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.json.simple.JSONObject;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/tweetpost")
@Slf4j
public class TweetPostController {

    @PostMapping("/publish")
    public JSONObject publishTweet(@RequestBody TweetPost tweetPost) {

        //TweetService calls fanout service throught RestTemplate
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<TweetPost> request = new HttpEntity<>(tweetPost);
        TweetPost foo = restTemplate.postForObject("http://localhost:9003/fanout", request, TweetPost.class);

        int tweetId = (int) ((Math.random() * (20 - 1)) + 1);
        JSONObject response = new JSONObject();
        response.put("Service", "Publish Tweet Service");
        response.put("tweetId", tweetId);
        response.put("text", tweetPost.getText());
        response.put("media", tweetPost.getMedia());
        return response;
    }

    @PostMapping("/retweet")
    public JSONObject retweetTweet(@RequestBody TweetPost tweetPost) {
        int tweetId = (int) ((Math.random() * (20 - 1)) + 1);
        JSONObject response = new JSONObject();
        response.put("Service", "Retweet Tweet Service");
        response.put("tweetId", tweetId);
        response.put("text", tweetPost.getText());
        response.put("userId", tweetPost.getUserId());
        return response;
    }

    @PostMapping("/comment")
    public JSONObject commentTweet(@RequestBody TweetPost tweetPost) {
        int tweetId = (int) ((Math.random() * (20 - 1)) + 1);
        JSONObject response = new JSONObject();
        response.put("Service", "Comment Tweet Service");
        response.put("tweetId", tweetId);
        response.put("text", tweetPost.getText());
        response.put("media", tweetPost.getMedia());
        response.put("userId", tweetPost.getUserId());
        return response;
    }
}
