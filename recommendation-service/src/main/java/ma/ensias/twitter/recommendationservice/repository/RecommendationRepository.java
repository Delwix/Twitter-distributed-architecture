package ma.ensias.twitter.recommendationservice.repository;

import ma.ensias.twitter.recommendationservice.entity.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {
}
