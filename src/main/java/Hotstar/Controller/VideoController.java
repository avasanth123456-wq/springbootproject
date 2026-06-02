package Hotstar.Controller;

import Hotstar.Service.VideoService;
import Hotstar.dto.VideoRequestDTO;
import Hotstar.dto.VideoResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotstar")
public class VideoController {
    @Autowired

    private VideoService service;

    public VideoController(VideoService service) {
        this.service = service;
    }

    @PostMapping("/video")
    public VideoResponseDTO addVideo(
            @RequestBody VideoRequestDTO dto) {

        return service.addVideo(dto);
    }

    @GetMapping("/watch/{id}")
    public String watchVideo(
            @PathVariable Long id) {

        service.streamVideo(id);

        return "Video Streaming Started";
    }

    }
