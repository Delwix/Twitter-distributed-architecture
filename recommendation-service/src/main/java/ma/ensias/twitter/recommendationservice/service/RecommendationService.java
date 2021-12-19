package ma.ensias.twitter.recommendationservice.service;

import ma.ensias.twitter.recommendationservice.entity.Recommendation;
import ma.ensias.twitter.recommendationservice.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationService {

    @Autowired
    RecommendationRepository recommendationRepository;
    public Recommendation getRecommendations(Long userId) {
        return recommendationRepository.findById(userId).get();
    }
}
