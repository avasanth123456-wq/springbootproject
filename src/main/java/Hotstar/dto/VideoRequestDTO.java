package Hotstar.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VideoRequestDTO {


    private String search;
    private String category;
    private int durations;

    public String getSearch() {
        return search;
    }

    public String getCategory() {
        return category;
    }

    public int getDurations() {
        return durations;
    }

    public void setSearch(String search) {
        this.search= search;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDurations(int durations) {
        this.durations = this.durations;
    }

}
