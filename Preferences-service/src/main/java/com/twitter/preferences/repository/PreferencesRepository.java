package com.twitter.preferences.repository;

import com.twitter.preferences.entity.TweetPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreferencesRepository extends JpaRepository<TweetPost, Long> {

}
