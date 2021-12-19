package ma.ensias.twitter.timeline.hometimelineservice.entity;

import jdk.jfr.Enabled;

import javax.persistence.*;

@Entity
public class TweetInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long tweetId;
    private Long userId;

    @ManyToOne
    private TimelineQueue timelineQueue;

    public TweetInfo(Long tweetId, Long userId) {
        this.tweetId = tweetId;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TweetInfo(){}

    public Long getTweetId() {
        return tweetId;
    }

    public void setTweetId(Long tweetId) {
        this.tweetId = tweetId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public TimelineQueue getTimelineQueue() {
        return timelineQueue;
    }

    public void setTimelineQueue(TimelineQueue timelineQueue) {
        this.timelineQueue = timelineQueue;
    }
}
