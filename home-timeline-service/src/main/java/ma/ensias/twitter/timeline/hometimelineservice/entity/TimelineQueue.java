package ma.ensias.twitter.timeline.hometimelineservice.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class TimelineQueue {
    @Id
    private Long userId;

    @OneToMany
    private List<TweetInfo> tweetInfoList;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long id) {
        this.userId = id;
    }

    public List<TweetInfo> getTweetInfoList() {
        return tweetInfoList;
    }

    public void setTweetInfoList(List<TweetInfo> tweetInfoList) {
        this.tweetInfoList = tweetInfoList;
    }
}
