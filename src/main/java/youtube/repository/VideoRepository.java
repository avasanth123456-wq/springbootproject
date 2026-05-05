package youtube.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import youtube.entity.Video;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
