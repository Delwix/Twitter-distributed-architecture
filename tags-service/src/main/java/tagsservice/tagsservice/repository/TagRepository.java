package tagsservice.tagsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tagsservice.tagsservice.entity.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

}
