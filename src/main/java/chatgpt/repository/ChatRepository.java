package chatgpt.repository;

import chatgpt.entity.ChatgptMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<ChatgptMessage,Long> {

}
