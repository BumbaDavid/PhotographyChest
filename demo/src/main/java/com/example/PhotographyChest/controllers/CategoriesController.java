package com.example.PhotographyChest.controllers;

import com.example.PhotographyChest.models.PhotosCategories;
import com.example.PhotographyChest.repositories.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class CategoriesController {
    @Autowired
    private CategoriesRepository categoriesRepository;


    @GetMapping("/categories")
    public Iterable<PhotosCategories> getAll(){
        return categoriesRepository.findAll();
    }
}
