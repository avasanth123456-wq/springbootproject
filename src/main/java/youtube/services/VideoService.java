package youtube.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import youtube.dto.VideoRequest;
import youtube.dto.VideoResponse;
import youtube.entity.Video;
import youtube.repository.VideoRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VideoService {
    @Autowired

    private VideoRepository repository;

    public VideoResponse upload(VideoRequest request){
        Video video =Video.builder()
                .id(request.getId())
                .title(request.getTitle())
                .description(request.getDescription())
                .url(request.getUrl())
                .views(0L)
                .build();

        Video saved =repository.save(video);

        return mapToResponse(saved);
    }
     public List<VideoResponse>getAllvideos(){
        return repository.findAll()
                .stream()
                .map(this::mapToResponse)
                .toList();
     }
     public  VideoResponse getVideo(Long id){
        Video video = repository.findById(id)
                .orElseThrow(()->new RuntimeException("video not found"));

        video.setViews(video.getViews());
        repository.save(video);

        return  mapToResponse(video);
     }

    private VideoResponse mapToResponse(Video video) {

        return  VideoResponse.builder()
                .id(video.getId())
                .title(video.getTitle())
                .description(video.getDescription())
                .url(video.getUrl())
                .views(video.getViews())
                .build();
    }
}
