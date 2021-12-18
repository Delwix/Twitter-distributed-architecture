package ma.ensias.twitter.timeline.usertimelineservice.Repository;

import ma.ensias.twitter.timeline.usertimelineservice.entity.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
    @Query("Select u from Tweet u where u.userId=?1")
    List<Tweet> findAllTweetsById(Long userId);
}
