package ma.ensias.twitter.recommendationservice.controller;


import ma.ensias.twitter.recommendationservice.entity.Recommendation;
import ma.ensias.twitter.recommendationservice.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recommendations")
public class RecommendationController {

    @Autowired
    RecommendationService recommendationService;

    @GetMapping("/{id}")
    public Recommendation getRecommendations(@PathVariable("id") Long userId){
        return recommendationService.getRecommendations(userId);
    }
}
