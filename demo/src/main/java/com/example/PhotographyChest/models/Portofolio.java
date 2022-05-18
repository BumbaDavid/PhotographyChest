package com.example.PhotographyChest.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jdk.jfr.Category;

import javax.persistence.*;
import java.util.List;

@Entity
public class Portofolio {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    private String photo;



    private int price;

    @ManyToOne
    @JoinColumn(name="category_id",nullable = false)
    @JsonManagedReference
    private PhotosCategories category;
    @ManyToOne
    @JoinColumn(name="credentials_id",nullable = false)
    @JsonBackReference
    private Credentials credentials;


    public Portofolio() {
    }

    public Portofolio(String photo, PhotosCategories category, int price, Credentials credentials) {
        this.photo = photo;
        this.category = category;
        this.price = price;
        this.credentials = credentials;


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

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}