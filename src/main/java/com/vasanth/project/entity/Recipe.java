package com.vasanth.project.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "recipes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 500)
    private String description;

    private String imageUrl;

    private Double price;

    private String category;
}
