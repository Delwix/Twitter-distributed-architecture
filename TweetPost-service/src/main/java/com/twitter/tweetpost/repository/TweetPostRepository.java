package com.twitter.tweetpost.repository;

import com.twitter.tweetpost.entity.TweetPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetPostRepository extends JpaRepository<TweetPost, Long> {

}
