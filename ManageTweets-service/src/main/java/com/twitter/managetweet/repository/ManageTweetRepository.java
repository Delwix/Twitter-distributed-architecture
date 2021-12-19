package com.twitter.managetweet.repository;

import com.twitter.managetweet.entity.TweetPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManageTweetRepository extends JpaRepository<TweetPost, Long> {

}
