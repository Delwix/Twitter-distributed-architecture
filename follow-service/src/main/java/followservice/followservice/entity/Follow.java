package followservice.followservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Follow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long followerId;
    private Long followeeId;

    public Follow() {
    }

    public Follow(Long followerId, Long followeeId) {
        super();
        this.followerId = followerId;
        this.followeeId = followeeId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFollowerId() {
        return followerId;
    }

    public void setFollowerId(Long followerId) {
        this.followerId = followerId;
    }

    public Long getFolloweeId() {
        return followeeId;
    }

    public void setFolloweeId(Long followeeId) {
        this.followeeId = followeeId;
    }
}
