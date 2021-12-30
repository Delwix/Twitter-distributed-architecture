package followservice.followservice.service;

import followservice.followservice.dto.IdDTO;
import followservice.followservice.entity.User;
import followservice.followservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService{
    @Autowired
    UserRepository userRepository;

    /*
     * (non-Javadoc)
     * @see org.asnworks.apis.friendmanagement.service.UserProfileService#signUp(org.asnworks.apis.friendmanagement.domain.UserProfile)
     */
    @Override
    public User signUp(final IdDTO idDTO) {
        return userRepository.save(createUser(idDTO.getId()));
    }

    /**
     * @param id
     * @return User
     */
    private User createUser(final Long id) {
        return new User(id);
    }
}
