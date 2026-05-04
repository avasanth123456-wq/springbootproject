package whatapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import whatapp.entity.Message;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {

    List<Message> findBySenderIdAndReceiverId(Long senderId, Long receiverId);

    List<Message> findByReceiverId(Long receiverId);
}
