

package com.vasanth.project.dto;

import lombok.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
@Getter
@Setter
@Builder
public class RecipeDTO implements Serializable {


    private Long id;

    private String title;

    private String imageUrl;

    private String description;

    private Double price;

    private String category;

    public String getImage() {
        return null;
    }
}

