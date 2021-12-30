package followservice.followservice.controller;

import followservice.followservice.dto.*;
import followservice.followservice.service.FollowService;
import followservice.followservice.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FollowManagementController {
    private static final Logger LOG = LoggerFactory.getLogger(FollowManagementController.class);

    @Autowired
    UserService userService;

    @Autowired
    FollowService followService;

    @PostMapping("/signup")
    public void signUp(@RequestBody IdDTO idDTO) {
        userService.signUp(idDTO);
    }

    /**
     * @param toggleFollowDTO
     */
    @PostMapping("/follow")
    public void follow(@RequestBody ToggleFollowDTO toggleFollowDTO) {
            LOG.info("Start :: follow :: {} {}", toggleFollowDTO.getRequestor(), toggleFollowDTO.getTarget());
            followService.follow(toggleFollowDTO);
            LOG.info("End :: follow :: {} {}", toggleFollowDTO.getRequestor(), toggleFollowDTO.getTarget());
    }
}
