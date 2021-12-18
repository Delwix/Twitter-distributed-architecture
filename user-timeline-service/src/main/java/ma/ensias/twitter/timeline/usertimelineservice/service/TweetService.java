package ma.ensias.twitter.timeline.usertimelineservice.service;

import ma.ensias.twitter.timeline.usertimelineservice.Repository.TweetRepository;
import ma.ensias.twitter.timeline.usertimelineservice.entity.Tweet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TweetService {

    @Autowired
    TweetRepository tweetRepository;

    public List<Tweet> getUserTimeline(Long userId){
        return tweetRepository.findAllTweetsById(userId);
    }
}
