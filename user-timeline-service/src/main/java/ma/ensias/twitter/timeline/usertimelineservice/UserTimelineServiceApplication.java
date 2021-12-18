package ma.ensias.twitter.timeline.usertimelineservice;

import ma.ensias.twitter.timeline.usertimelineservice.Repository.TweetRepository;
import ma.ensias.twitter.timeline.usertimelineservice.entity.Tweet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserTimelineServiceApplication implements CommandLineRunner {

	@Autowired
	private TweetRepository tweetRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserTimelineServiceApplication.class, args);
	}

	@Override
	public void run(String... strings){
		Tweet tweet1 = new Tweet(11L, 1L, "This is my first tweet");
		Tweet tweet2 = new Tweet(10L, 1L, "This is my Second Tweet =)");
		tweetRepository.save(tweet1);
		tweetRepository.save(tweet2);
	}
}
