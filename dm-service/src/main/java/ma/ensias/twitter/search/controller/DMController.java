package ma.ensias.twitter.dm.controller;


import ma.ensias.twitter.dm.service.DMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/messaging")
public class DMController {

    @Autowired
    private DMService dmService;

//    @GetMapping("/{id}")
//    public ResponseFile getUserTimeline(@PathVariable("id") Long userId) {
//        return tweetService.getUserTimeline(userId);
//    }

}
