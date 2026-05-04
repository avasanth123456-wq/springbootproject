package whatapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import whatapp.dto.MessageDTO;
import whatapp.request.MessageRequest;
import whatapp.service.MessageService;

import java.util.List;

@RestController
@RequestMapping("/message")
@RequiredArgsConstructor
public class MessageController {
    @Autowired
    private MessageService service;

    @PostMapping("/send")

    public MessageDTO send(@RequestBody MessageRequest request) {
        return service.sendMessage(request);
    }
    @GetMapping("/chat")
    public List<MessageDTO> getChat(
            @RequestParam Long senderId,
            @RequestParam Long receiverId) {

        return service.getChat(senderId, receiverId);
    }
}
