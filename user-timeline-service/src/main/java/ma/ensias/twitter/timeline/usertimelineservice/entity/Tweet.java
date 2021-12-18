package ma.ensias.twitter.timeline.usertimelineservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tweet {
    @Id
    private Long tweetId;
    private Long userId;
    private String text;

    public Tweet(Long tweetId, Long userId, String text) {
        this.tweetId = tweetId;
        this.userId = userId;
        this.text = text;
    }

    public Tweet() {

    }

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
