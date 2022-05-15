package com.example.PhotographyChest.repositories;

import com.example.PhotographyChest.models.PhotosCategories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<PhotosCategories,Long> {
}
