package com.twitter.preferences.entity;

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
public class TweetPost {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tweetId;
    private Long userId;
    private String text;
    private String media;
}
