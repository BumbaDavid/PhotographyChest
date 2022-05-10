package com.example.PhotographyChest.models;

import jdk.jfr.Category;

import javax.persistence.*;

@Entity
public class Portofolio {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id


    private String photo;



    private int price;
    @ManyToOne
    private PhotosCategories category;

    public Portofolio() {
    }

    public Portofolio(String photo, PhotosCategories category, int price) {
        this.photo = photo;
        this.category = category;
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String name) {
        this.photo = name;
    }

    public PhotosCategories getCategory() {
        return category;
    }

    public void setCategory(PhotosCategories category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
