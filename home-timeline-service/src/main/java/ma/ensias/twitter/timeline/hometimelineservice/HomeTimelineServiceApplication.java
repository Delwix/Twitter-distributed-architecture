package ma.ensias.twitter.timeline.hometimelineservice;

import com.netflix.discovery.converters.Auto;
import ma.ensias.twitter.timeline.hometimelineservice.Repository.TimelineRepository;
import ma.ensias.twitter.timeline.hometimelineservice.Repository.TweetInfoRepository;
import ma.ensias.twitter.timeline.hometimelineservice.Repository.TweetRepository;
import ma.ensias.twitter.timeline.hometimelineservice.entity.TimelineQueue;
import ma.ensias.twitter.timeline.hometimelineservice.entity.Tweet;
import ma.ensias.twitter.timeline.hometimelineservice.entity.TweetInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.AccessType;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HomeTimelineServiceApplication implements CommandLineRunner {



	@Autowired
	private TimelineRepository timelineRepository;

	@Autowired
	private TweetInfoRepository tweetInfoRepository;

	@Autowired
	private TweetRepository tweetRepository;

	public static void main(String[] args) {
		SpringApplication.run(HomeTimelineServiceApplication.class, args);
	}

	@Override
	public void run(String... strings){
		TweetInfo tweetInfo1 = new TweetInfo(1L, 1L);
		TweetInfo tweetInfo2 = new TweetInfo(2L, 1L);
		tweetInfoRepository.save(tweetInfo1);
		tweetInfoRepository.save(tweetInfo2);
		List<TweetInfo> list = new ArrayList<>();
		list.add(tweetInfo1); list.add(tweetInfo2);

		TimelineQueue timelineQueue = new TimelineQueue();
		timelineQueue.setUserId(1L);
		timelineQueue.setTweetInfoList(list);
		timelineRepository.save(timelineQueue);

		Tweet tweet1 = new Tweet(1L, 1L, "This is my first tweet");
		Tweet tweet2 = new Tweet(2L, 1L, "This is my Second Tweet =)");
		tweetRepository.save(tweet1);
		tweetRepository.save(tweet2);
	}
}
