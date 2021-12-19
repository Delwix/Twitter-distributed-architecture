package com.twitter.blockservice.blockservice.service;

import com.twitter.blockservice.blockservice.dto.ToggleFollowDTO;

public interface BlockService {
    void block(final ToggleFollowDTO toggleFollowDTO);
}
