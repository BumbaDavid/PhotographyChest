package com.example.PhotographyChest.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
public class Credentials {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String username;

    private String password;

    private int role;

    @OneToMany(mappedBy = "credentials")
    @JsonManagedReference
    private List<Portofolio> portofolio;

    public Credentials() {
    }

    public Credentials(String username, String password, int role) {
        this.username = username;
        this.password = password;
        this.role = role;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public List<Portofolio> getPortofolio() {
        return portofolio;
    }

    public void setPortofolio(List<Portofolio> portofolio) {
        this.portofolio = portofolio;
    }
}
