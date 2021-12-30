package followservice.followservice.service;

import followservice.followservice.dto.ToggleFollowDTO;
import followservice.followservice.entity.Follow;
import followservice.followservice.repository.FollowRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowServiceImpl implements FollowService {
    private static final Logger LOG = LoggerFactory.getLogger(FollowServiceImpl.class);

    @Autowired
    FollowRepository followRepository;

    @Override
    public void follow(final ToggleFollowDTO toggleFollowDTO) {
        LOG.info("Start :: follow {} {}", toggleFollowDTO.getRequestor(), toggleFollowDTO.getTarget());
        LOG.info("End :: scubscribe {} {}", toggleFollowDTO.getRequestor(), toggleFollowDTO.getTarget());
    }

    private Follow createFollow(final Long requestor, final Long target) {
        return new Follow(requestor, target);
    }
}
