package Hotstar.Entity;

import jakarta.persistence.*;

@Entity
@Table(name ="videos")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String search;

    private String category;

    private int durations;



    public Video(){
    }

    public  Video(String search ,String category, int durations){

        this.search = search;
        this.category =category;
        this.durations = durations;
    }
    public Long getId() {
        return id;
    }

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
