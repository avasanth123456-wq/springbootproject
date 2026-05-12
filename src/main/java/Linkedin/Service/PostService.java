package Linkedin.Service;

import Linkedin.dto.request.PostRequest;
import Linkedin.entity.Post;
import Linkedin.entity.Useres;
import Linkedin.repository.PostRepository;
import Linkedin.repository.UseresRepository;
import instagram.dto.responedto.PostResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired

    private PostRepository postRepository;
    private UseresRepository useresRepository;

    public PostService(PostRepository postRepository,
                       UseresRepository useresRepository){
        this.postRepository= postRepository;
        this.useresRepository = useresRepository;
    }

    public PostResponse createPost(Long useresId, PostRequest request){
        Useres useres = useresRepository.findById(useresId)
                .orElseThrow(()-> new RuntimeException("Useres not found"));

        Post post = new Post();

        post.setContent(request.getContent());
        post.setUseres(useres);

        Post saved = postRepository.save(post);

        return  new PostResponse(
                saved.getId(),
                saved.getContent(),
               saved.getUsers().getName()

        );
    }
}
