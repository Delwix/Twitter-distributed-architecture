package followservice.followservice.service;

import followservice.followservice.dto.ToggleFollowDTO;

public interface FollowService {
    /**
     * @param toggleFollowDTO
     */
    void follow(final ToggleFollowDTO toggleFollowDTO);

}
