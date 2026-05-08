package chatgpt.controller;

import chatgpt.Service.ChatgptService;
import chatgpt.dto.repsonedto;
import chatgpt.entity.ChatgptMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Chat")
@RequiredArgsConstructor
public class ChatController {
    @Autowired
    private ChatgptService service;

    @PostMapping
    public repsonedto chat(@RequestBody ChatgptMessage chat) {
        return service.chat(chat);
    }

}
