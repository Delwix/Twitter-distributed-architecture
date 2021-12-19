package com.twitter.followservice.follow.repository;

import com.twitter.followservice.follow.entity.Follow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FollowRepository extends JpaRepository<Follow, Long> {
    List<String> fetchFollowers(@Param("followee") final String target);
}
