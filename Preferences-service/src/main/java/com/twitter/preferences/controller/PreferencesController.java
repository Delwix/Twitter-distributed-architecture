package com.twitter.preferences.controller;

import com.twitter.preferences.entity.TweetPost;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.json.simple.JSONObject;

@RestController
@RequestMapping("/preferences")
@Slf4j
public class PreferencesController {

    @PostMapping("/bookmark")
    public JSONObject bookmarkTweet(@RequestBody TweetPost tweetPost) {
        JSONObject response = new JSONObject();
        response.put("tweetId", tweetPost.getTweetId());
        response.put("userId", tweetPost.getUserId());
        return response;
    }

    @PostMapping("/signal")
    public JSONObject signalTweet(@RequestBody TweetPost tweetPost) {
        JSONObject response = new JSONObject();
        response.put("tweetId", tweetPost.getTweetId());
        response.put("userId", tweetPost.getUserId());
        return response;
    }

    @PostMapping("/react")
    public JSONObject reactTweet(@RequestBody TweetPost tweetPost) {
        JSONObject response = new JSONObject();
        response.put("Service", "React to Tweet Service");
        response.put("tweetId", tweetPost.getTweetId());
        response.put("userId", tweetPost.getUserId());
        return response;
    }

}
