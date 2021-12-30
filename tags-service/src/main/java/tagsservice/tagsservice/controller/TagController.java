package tagsservice.tagsservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tagsservice.tagsservice.entity.Tag;
import tagsservice.tagsservice.service.TagService;

@RestController
@RequestMapping("/tags")
@Slf4j
public class TagController {

    @Autowired
    private TagService tagService;

    @PostMapping("/")
    public Tag saveTag(@RequestBody Tag tag) {
        log.info("Inside saveTag of TagController");
        return tagService.saveTag(tag);
    }
}
