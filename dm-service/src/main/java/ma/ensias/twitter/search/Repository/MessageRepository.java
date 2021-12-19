package ma.ensias.twitter.dm.Repository;

import ma.ensias.twitter.dm.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;



public interface MessageRepository extends JpaRepository<Message, Long> {

}
