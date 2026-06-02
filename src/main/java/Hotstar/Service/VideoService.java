package Hotstar.Service;


import Hotstar.Entity.Video;
import Hotstar.Repository.VideoRepository;
import Hotstar.dto.VideoRequestDTO;
import Hotstar.dto.VideoResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class VideoService {

    @Autowired

    private VideoRepository repository;

    public VideoService(VideoRepository repository) {
        this.repository = repository;
    }

    public VideoResponseDTO addVideo(VideoRequestDTO dto) {

        Video video = new Video(
                dto.getSearch(),
                dto.getCategory(),
                dto.getDurations());

        Video saved = repository.save(video);

        return new VideoResponseDTO(
                saved.getId(),
                saved.getSearch(),
                "Video Added Successfully");
    }

    @Async
    public void streamVideo(Long videoId) {

        try {

            System.out.println(
                    Thread.currentThread().getName()
                            + " Streaming Video : "
                            + videoId);

            Thread.sleep(5000);
            System.out.println(
                    Thread.currentThread().getName()
                            + " Completed Video : "
                            + videoId);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}