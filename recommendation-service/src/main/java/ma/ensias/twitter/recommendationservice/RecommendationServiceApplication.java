package ma.ensias.twitter.recommendationservice;

import ma.ensias.twitter.recommendationservice.entity.Recommendation;
import ma.ensias.twitter.recommendationservice.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class RecommendationServiceApplication implements CommandLineRunner {

	@Autowired
	private RecommendationRepository recommendationRepository;

	public static void main(String[] args) {
		SpringApplication.run(RecommendationServiceApplication.class, args);
	}

	@Override
	public void run(String... strings){
		Recommendation recommendation = new Recommendation();
		recommendation.setUserId(1L);

		List<Long> listOfTweetIds = new ArrayList<>();
		listOfTweetIds.addAll(Arrays.asList(3L, 4L));
		recommendation.setListTweetIds(listOfTweetIds);
		recommendationRepository.save(recommendation);
	}
}
