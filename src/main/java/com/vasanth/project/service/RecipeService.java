package com.vasanth.project.service;

import com.vasanth.project.dto.RecipeDTO;
import com.vasanth.project.entity.Recipe;
import com.vasanth.project.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RecipeService {

    @Autowired
    private  RecipeRepository recipeRepository;

    public Recipe saveRecipe(RecipeDTO dto) {
          Recipe recipe = new Recipe();
          recipe.setId(dto.getId());
         recipe.setTitle(dto.getTitle());
        recipe.setImageUrl(dto.getImage());
        recipe.setDescription(dto.getDescription());
        recipe.setPrice(dto.getPrice());
        recipe.setCategory(dto.getCategory());
        System.out.println("123");
        return recipeRepository.save(recipe);

      }
 }
