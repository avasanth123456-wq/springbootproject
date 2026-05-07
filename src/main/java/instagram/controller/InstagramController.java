package instagram.controller;

import instagram.dto.requestdto.FollowRequest;
import instagram.dto.requestdto.PostRequest;
import instagram.dto.requestdto.UsersRequest;
import instagram.dto.responedto.FollowResponse;
import instagram.dto.responedto.PostResponse;
import instagram.dto.responedto.UsersResponse;
import instagram.service.InstagramService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class InstagramController {

    private  final InstagramService service;

    @PostMapping("/users")
    public UsersResponse regsister(@RequestBody UsersRequest request){
        return service.regsister(request);
    }
    @PostMapping("/posts/{userId}")
    public PostResponse createPost(@PathVariable Long userId,
                                   @RequestBody PostRequest request){
        return service.createPost(userId,request);
    }
    @PutMapping("/posts/{postId}/like")

    public PostResponse like(@PathVariable Long postId){
        return service.likePost(postId);
    }
    @PostMapping("/follow")
    public FollowResponse follow(@RequestBody FollowRequest request) {
        return service.follow(request);
    }
}
