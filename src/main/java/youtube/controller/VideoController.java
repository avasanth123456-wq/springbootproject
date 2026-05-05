package youtube.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import youtube.dto.VideoRequest;
import youtube.dto.VideoResponse;
import youtube.services.VideoService;

import java.util.List;

@RestController
@RequestMapping("/api/videos")
@RequiredArgsConstructor
public class VideoController {

    @Autowired

    private VideoService service;

    @PostMapping
    public VideoResponse upload(@RequestBody VideoRequest request){
        return service.upload(request);
    }
    @GetMapping
    public List<VideoResponse> getAll(){
        return  service.getAllvideos();
    }
    @GetMapping("/{id}")
    public VideoResponse getById(@PathVariable Long id){
        return service.getVideo(id);
    }

}
