package tagsservice.tagsservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tagId;
    private Long userId;
    private Long taggedAccountId;
    private Long tweetId;

    public Tag() {
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId=userId;
    }

    public Long getTaggedAccountId() {
        return taggedAccountId;
    }

    public void setTaggedAccountId(Long taggedAccountId) {
        this.taggedAccountId=taggedAccountId;
    }

    public Long getTweetId() {
        return tweetId;
    }

    public void setTweetId(Long tweetId) {
        this.tweetId=tweetId;
    }
}
