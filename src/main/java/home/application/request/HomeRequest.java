package home.application.request;

import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Builder
public class HomeRequest {

    private  Long id;

    private  String title;

    private String description;
}
