package ma.ensias.twitter.search.controller;


import ma.ensias.twitter.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private SearchService searchService;

//    @GetMapping("/{id}")
//    public ResponseFile getUserTimeline(@PathVariable("id") Long userId) {
//        return tweetService.getUserTimeline(userId);
//    }

}
