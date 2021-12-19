package com.twitter.sharing.repository;

import com.twitter.sharing.entity.TweetPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SharingRepository extends JpaRepository<TweetPost, Long> {

}
