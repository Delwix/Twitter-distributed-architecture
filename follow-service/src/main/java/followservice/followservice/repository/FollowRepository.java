package followservice.followservice.repository;

import followservice.followservice.entity.Follow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface FollowRepository extends JpaRepository<Follow, Long> {
    /**
     * @param followeeId
     * @return List of followers for given follow.
     */
    List<Long> fetchFollowers(@Param("followeeId") final Long followeeId);
}
