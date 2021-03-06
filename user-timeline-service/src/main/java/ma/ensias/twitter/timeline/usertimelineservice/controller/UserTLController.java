package ma.ensias.twitter.timeline.usertimelineservice.controller;

import ma.ensias.twitter.timeline.usertimelineservice.dto.ResponseFile;
import ma.ensias.twitter.timeline.usertimelineservice.entity.Tweet;
import ma.ensias.twitter.timeline.usertimelineservice.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usertimeline")
public class UserTLController {

    @Autowired
    private TweetService tweetService;

    @GetMapping("/{id}")
    public ResponseFile getUserTimeline(@PathVariable("id") Long userId) {
        return tweetService.getUserTimeline(userId);
    }

}
