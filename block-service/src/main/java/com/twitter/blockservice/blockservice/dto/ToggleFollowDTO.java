package com.twitter.blockservice.blockservice.dto;

public class ToggleFollowDTO {
    private String follower;
    private String target;

    public String getFollower() {
        return follower;
    }

    public void setFollower(String follower) {
        this.follower = follower;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
