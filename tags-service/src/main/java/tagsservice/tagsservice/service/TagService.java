package tagsservice.tagsservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tagsservice.tagsservice.entity.Tag;
import tagsservice.tagsservice.repository.TagRepository;

@Service
@Slf4j
public class TagService {

    @Autowired
    private TagRepository tagRepository;

    public Tag saveTag(Tag tag) {
        log.info("Inside saveTag of TagService");
        return tagRepository.save(tag);
    }
}
