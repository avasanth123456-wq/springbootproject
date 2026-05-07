package instagram.service;

import instagram.dto.requestdto.FollowRequest;
import instagram.dto.requestdto.PostRequest;
import instagram.dto.requestdto.UsersRequest;
import instagram.dto.responedto.FollowResponse;
import instagram.dto.responedto.PostResponse;
import instagram.dto.responedto.UsersResponse;
import instagram.entitylayer.Follow;
import instagram.entitylayer.Post;
import instagram.entitylayer.Users;
import instagram.repositorylayer.FollowRepository;
import instagram.repositorylayer.PostRepository;
import instagram.repositorylayer.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InstagramService {

    private final UsersRepository usersRepository;
    private final PostRepository postRepository;
    private final FollowRepository followRepository;


    public UsersResponse regsister(UsersRequest request) {

        Users users = new Users();

        users.setUsername(request.getUsername());
        users.setEmail(request.getEmail());
        users.setPassword(request.getPassword());


        usersRepository.save(users);

        return UsersResponse.builder()
                .id(users.getId())
                .username(users.getUsername())
                .email(users.getEmail())
                .build();
    }

    public PostResponse createPost(Long userId, PostRequest request) {
        Users users = usersRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));


        Post post = new Post();
        post.setImageUrl(request.getImageUrl());
        post.setCaption(request.getCaption());
        post.setUsers(users);

        postRepository.save(post);

        return PostResponse.builder()
                .id(post.getId())
                .imageUrl(post.getImageUrl())
                .caption(post.getCaption())
                .likes(post.getLikes())
                .username(users.getUsername())
                .build();
    }

    public PostResponse likePost(Long postId) {
        Post post = postRepository.findById(postId).orElseThrow();
        post.setLikes(post.getLikes() + 1);

        postRepository.save(post);

        return PostResponse.builder()
                .id(post.getId())
                .imageUrl(post.getImageUrl())
                .caption(post.getCaption())
                .likes(post.getLikes())
                .username(post.getUsers().getUsername())
                .build();
    }

    public FollowResponse follow(FollowRequest request) {
        Users follower = usersRepository.findById(request.getFollowerId())
                .orElseThrow(() -> new RuntimeException("Follower not found"));

        Users following = usersRepository.findById(request.getFollowingId())
                .orElseThrow(() -> new RuntimeException("Following user not found"));
        Follow f = new Follow();
        f.setFollower(follower);
        f.setFollowing(following);

        followRepository.save(f);

        return FollowResponse.builder()
                .id(f.getId())
                .followerName(follower.getUsername())
                .followingName(following.getUsername())
                .build();
    }
}