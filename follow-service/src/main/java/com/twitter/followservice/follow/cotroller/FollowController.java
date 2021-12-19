package com.twitter.followservice.follow.cotroller;

import com.twitter.followservice.follow.dto.ToggleFollowDTO;
import com.twitter.followservice.follow.entity.Follow;
import com.twitter.followservice.follow.repository.FollowRepository;
import com.twitter.followservice.follow.service.FollowService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/follows")
public class FollowController {

    @Autowired
    private FollowService followService;

    @Autowired
    FollowRepository followRepository;

    private static final Logger LOG = LoggerFactory.getLogger(FollowService.class);

    @PostMapping("/")
    public void follow(@RequestBody final ToggleFollowDTO toggleFollowDTO) {
        LOG.info("Start :: follow {} {}", toggleFollowDTO.getFollower(), toggleFollowDTO.getTarget());
        checkFollowCriteria(toggleFollowDTO.getFollower(), toggleFollowDTO.getTarget());
        LOG.info("End :: follow {} {}", toggleFollowDTO.getFollower(), toggleFollowDTO.getTarget());
    }
    private void checkFollowCriteria(final String follower, final String target) {
        LOG.info("Start :: checkFollowCriteria {} {}", follower, target);
        if (follower == null || target == null) {
            LOG.info("InvalidRequestException :: checkFollowCriteria {} {}", follower, target);
        }
        List<String> targetFollowers = followRepository.fetchFollowers(target);

        if (targetFollowers.contains(follower)) {
            LOG.info("DuplicateFollowRequest :: checkFollowCriteria {} {}", follower, target);
        }

        followRepository.save(createFollow(follower, target));
        LOG.info("End :: checkFollowCriteria {} {}", follower, target);
    }

    private Follow createFollow(final String follower, final String target) {
        return new Follow(follower, target);
    }

}
