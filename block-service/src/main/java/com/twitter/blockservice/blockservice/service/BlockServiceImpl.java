package com.twitter.blockservice.blockservice.service;

import java.util.List;

import com.twitter.blockservice.blockservice.dto.ToggleFollowDTO;
import com.twitter.blockservice.blockservice.entity.Block;
import com.twitter.blockservice.blockservice.repository.BlockRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sudambat
 */
@Service

public class BlockServiceImpl implements BlockService {

    private static final Logger LOG = LoggerFactory.getLogger(BlockServiceImpl.class);

    @Autowired
    BlockRepository blockRepository;

    /*
     * (non-Javadoc)
     * @see org.asnworks.apis.friendmanagement.service.BlockService#block(org.asnworks.apis.friendmanagement.domain.ToggleSubscription)
     */
    @Override
    public void block(ToggleFollowDTO toggleSubscriptionDTO) {
        LOG.info("Start :: block {} {}", toggleSubscriptionDTO.getFollower(), toggleSubscriptionDTO.getTarget());
        checkBlockCriteria(toggleSubscriptionDTO.getFollower(), toggleSubscriptionDTO.getTarget());
        LOG.info("End :: block {} {}", toggleSubscriptionDTO.getFollower(), toggleSubscriptionDTO.getTarget());

    }

    private void checkBlockCriteria(final String requestor, final String target) {
        LOG.info("Start :: checkBlockCriteria {} {}", requestor, target);
        if (requestor == null || target == null) {
        }

        List<String> targetBlockers = blockRepository.fetchBlockers(target);

        if (targetBlockers.contains(requestor)) {
            LOG.info("FriendBlockedException :: checkBlockCriteria {} {}", requestor, target);
        }

        blockRepository.save(createBlock(requestor, target));
        LOG.info("End :: checkBlockCriteria {} {}", requestor, target);

    }

    private Block createBlock(final String follower, final String target) {
        return new Block(follower, target);
    }

}
