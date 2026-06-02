package Hotstar.dto;


import lombok.*;

@Getter
@Setter
@Builder
public class VideoResponseDTO {

    private Long id;
    private String search;
    private String message;

    public VideoResponseDTO() {
    }

    public VideoResponseDTO(Long id, String search, String message) {
        this.id = id;
        this.search= search;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public String getsearch() {
        return search;
    }

    public String getMessage() {
        return message;
    }
}