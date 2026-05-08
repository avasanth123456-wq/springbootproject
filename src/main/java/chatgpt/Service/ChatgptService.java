package chatgpt.Service;

import chatgpt.dto.repsonedto;
import chatgpt.entity.ChatgptMessage;
import chatgpt.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatgptService {
    @Autowired

    private ChatRepository repository;

    public repsonedto chat(ChatgptMessage request){
        String Usermessage = request.getMessage();

        String reply;

        if (Usermessage.equalsIgnoreCase("hello")) {
            reply = "Hi User!";
        } else if (Usermessage.equalsIgnoreCase("how are you")) {
            reply = "I am fine.";
        } else {
            reply = "Sorry, I don't understand.";
        }

        ChatgptMessage message = new ChatgptMessage(Usermessage, reply);

       repository.save(message);

        return new repsonedto(reply);
    }
}
