package ma.ensias.twitter.timeline.hometimelineservice.Repository;

import ma.ensias.twitter.timeline.hometimelineservice.entity.TweetInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetInfoRepository extends JpaRepository<TweetInfo, Long> {
}
