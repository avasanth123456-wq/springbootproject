package Linkedin.controller;

import Linkedin.Service.PostService;
import Linkedin.dto.request.PostRequest;
import instagram.dto.responedto.PostResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostService service;

    public PostController(PostService service) {
        this.service = service;
    }

    @PostMapping("/{userId}")
    public PostResponse createPost(
            @PathVariable Long userId,
            @RequestBody PostRequest request) {

        return service.createPost(userId, request);
    }
}
