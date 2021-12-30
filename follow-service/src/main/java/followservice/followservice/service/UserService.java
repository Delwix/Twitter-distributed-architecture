package followservice.followservice.service;

import followservice.followservice.dto.IdDTO;
import followservice.followservice.entity.User;

public interface UserService {
    /**
     * @param idDTO
     * @return UserProfile
     */
    User signUp(final IdDTO idDTO);
}
