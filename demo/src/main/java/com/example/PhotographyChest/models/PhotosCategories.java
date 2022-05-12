package com.example.PhotographyChest.models;


import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.List;

@Entity
public class PhotosCategories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String category;
    private String imgURL;
    @OneToMany(mappedBy = "category")
    private List <Portofolio> photos;

    public PhotosCategories() {
    }

    public PhotosCategories(String category, String imgURL) {
        this.category = category;
        this.imgURL = imgURL;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
}
