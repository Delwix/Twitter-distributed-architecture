package com.twitter.sharing.controller;

import com.twitter.sharing.entity.TweetPost;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.json.simple.JSONObject;

@RestController
@RequestMapping("/share")
@Slf4j
public class SharingController {

    @PostMapping("")
    public JSONObject ShareTweet(@RequestBody TweetPost tweetPost) {
        JSONObject response = new JSONObject();
        response.put("tweetId", tweetPost.getTweetId());
        return response;
    }

}
