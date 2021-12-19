package com.twitter.followservice.follow.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Follow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long followId;
    private String followeeId;
    private String followerId;

    public Follow(String followeeId, String followerId) {
        super();
        this.followeeId = followeeId;
        this.followerId = followerId;
    }

}
