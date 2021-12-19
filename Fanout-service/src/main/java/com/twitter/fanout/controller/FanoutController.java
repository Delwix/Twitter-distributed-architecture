package com.twitter.fanout.controller;

import com.twitter.fanout.entity.TweetPost;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.json.simple.JSONObject;

@RestController
@RequestMapping("/fanout")
@Slf4j
public class FanoutController {

    @PostMapping("")
    public JSONObject fanoutTweet(@RequestBody TweetPost tweetPost) {
        int newTweetId = (int) ((Math.random() * (20 - 1)) + 1);
        JSONObject response = new JSONObject();
        response.put("tweetId", newTweetId);
        response.put("userId", tweetPost.getUserId());
        response.put("originalTweetId", tweetPost.getTweetId());
        return response;
    }
}
