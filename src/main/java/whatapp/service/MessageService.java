package whatapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import whatapp.dto.MessageDTO;
import whatapp.entity.Message;
import whatapp.repository.MessageRepository;
import whatapp.request.MessageRequest;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MessageService {
    @Autowired
    private MessageRepository repository;

    public MessageDTO sendMessage(MessageRequest request){
        Message message =Message.builder()
                .senderId(request.getSenderId())
                .receiverId(request.getReceiverId())
                .content(request.getContent())
                .timestamp(request.getTimestamp())
                .build();


        Message saved =repository.save(message);

        return mapToDTO(saved);
    }

    public List<MessageDTO> getChat(Long senderId,Long receiverId){
        return repository.findBySenderIdAndReceiverId(senderId,receiverId)
                .stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    private MessageDTO mapToDTO(Message message) {

        return MessageDTO.builder()
                .id(message.getId())
                .senderId(message.getSenderId())
                .receiverId(message.getReceiverId())
                .content(message.getContent())
                .timestamp(message.getTimestamp())
                .build();
    }
}
