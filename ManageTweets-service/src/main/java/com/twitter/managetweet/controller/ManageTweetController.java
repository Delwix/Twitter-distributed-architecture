package com.twitter.managetweet.controller;

import com.twitter.managetweet.entity.TweetPost;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;
import org.json.simple.JSONObject;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/managetweet")
@Slf4j
public class ManageTweetController {

    @DeleteMapping("/delete")
    public JSONObject deleteTweet(@RequestBody TweetPost tweetPost) {
        JSONObject response = new JSONObject();
        response.put("tweetId", tweetPost.getTweetId());
        return response;
    }

    @PatchMapping("/edit")
    public JSONObject editTweet(@RequestBody TweetPost tweetPost) {
        JSONObject response = new JSONObject();
        response.put("tweetId", tweetPost.getTweetId());
        response.put("text", "New text");
        response.put("media", "New Media");

        return response;
    }

}
