package ma.ensias.twitter.timeline.usertimelineservice.dto;

import ma.ensias.twitter.timeline.usertimelineservice.entity.Ad;
import ma.ensias.twitter.timeline.usertimelineservice.entity.Tweet;

import java.util.List;

public class ResponseFile {
    private List<Tweet> tweets;
    private List<Ad> ads;

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }

    public List<Ad> getAds() {
        return ads;
    }

    public void setAds(List<Ad> ads) {
        this.ads = ads;
    }
}
