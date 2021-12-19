package com.twitter.followservice.follow.service;

import com.twitter.followservice.follow.dto.ToggleFollowDTO;
import org.springframework.stereotype.Service;




@Service
public interface FollowService {
    void follow(final ToggleFollowDTO toggleFollowDTO);
}
