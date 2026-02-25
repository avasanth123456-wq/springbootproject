
package com.vasanth.project.controller;

import com.vasanth.project.dto.RecipeDTO;
import com.vasanth.project.entity.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import com.vasanth.project.repository.RecipeRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@CrossOrigin
public class RecipeControllers {

    @Autowired
    private RecipeRepository recipeRepository;

    @RequestMapping(path = "/recipe", method = RequestMethod.POST)
    public ResponseEntity<String> saveUser( @RequestBody RecipeDTO  DTO) {

        Recipe recipe = Recipe.builder()
                .id(DTO.getId())
                .title(DTO.getTitle())
                .imageUrl(DTO.getImageUrl())
                .description(DTO.getDescription())
                .price(DTO.getPrice())
                .category(DTO.getCategory()).build();
        recipeRepository.save(recipe);
        return ResponseEntity.ok("Recipe saved");

    }

}


