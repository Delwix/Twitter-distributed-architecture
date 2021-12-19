package ma.ensias.twitter.timeline.hometimelineservice.Repository;

import ma.ensias.twitter.timeline.hometimelineservice.entity.TimelineQueue;
import ma.ensias.twitter.timeline.hometimelineservice.entity.TweetInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TimelineRepository extends JpaRepository<TimelineQueue, Long> {

    @Query("Select u from TimelineQueue u where u.userId = ?1")
    TimelineQueue findTimelineQueueByUserId(Long userId);
}
