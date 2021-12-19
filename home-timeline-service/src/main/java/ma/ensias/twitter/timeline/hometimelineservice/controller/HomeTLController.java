package ma.ensias.twitter.timeline.hometimelineservice.controller;

import ma.ensias.twitter.timeline.hometimelineservice.dto.ResponseFile;
import ma.ensias.twitter.timeline.hometimelineservice.service.TimelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hometimeline")
public class HomeTLController {

    @Autowired
    private TimelineService timelineService;

    @GetMapping("/{id}")
    public ResponseFile getUserTimeline(@PathVariable("id") Long userId) {
        return timelineService.getUserHomeTimeline(userId);
    }

}
