package com.vasanth.project.controller;


import com.vasanth.project.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@Controller
@RequestMapping("/api/recipes")
@CrossOrigin(origins = "http://localhost:3000")
public class RecipeController {

    @GetMapping
    public List<Map<String, String>> getAllRecipes() {
        List<Map<String, String>> recipes = new ArrayList<>();

        Map<String, String> r1 = new HashMap<>();
        r1.put("id", "1");
        r1.put("title", "Paneer Butter Masala");
        r1.put("description", "A creamy tomato-based paneer curry");
        r1.put("image", "https://source.unsplash.com/400x300/?paneer,curry");

        Map<String, String> r2 = new HashMap<>();
        r2.put("id", "2");
        r2.put("title", "Chicken Biryani");
        r2.put("description", "Aromatic basmati rice with chicken and spices");
        r2.put("image", "https://source.unsplash.com/400x300/?biryani,chicken");

        recipes.add(r1);
        recipes.add(r2);

        return recipes;
    }

    @RequestMapping(path = "/createRecipes", method = RequestMethod.POST)
    public List<Map<String, String>> createRecipes() {
        List<Map<String, String>> recipes = new ArrayList<>();

        Map<String, String> r1 = new HashMap<>();
        r1.put("id", "1");
        r1.put("title", "Paneer Butter Masala");
        r1.put("description", "A creamy tomato-based paneer curry");
        r1.put("image", "https://source.unsplash.com/400x300/?paneer,curry");

        Map<String, String> r2 = new HashMap<>();
        r2.put("id", "2");
        r2.put("title", "Chicken Biryani");
        r2.put("description", "Aromatic basmati rice with chicken and spices");
        r2.put("image", "https://source.unsplash.com/400x300/?biryani,chicken");

        recipes.add(r1);
        recipes.add(r2);

        return recipes;
    }
}

