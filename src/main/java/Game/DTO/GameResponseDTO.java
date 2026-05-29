package Game.DTO;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Data
public class GameResponseDTO {
    private Long id;

    private String palyerName;

    private String gameName;

    public GameResponseDTO(Long id, String palyerName) {
        this.id = id;
        this.palyerName = palyerName;

        this.gameName=gameName;
    }

    public Long getId() {
        return id;
    }

    public String getPalyerName() {
        return palyerName;
    }

    public String getGameName(){
        return gameName;
    }
}