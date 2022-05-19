package com.example.PhotographyChest.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JsonManagedReference
    private Portofolio portofolioId;

    private String status;

    private String reason;

    public Orders(){

    }

    public Orders(Portofolio portofolioId, String status, String reason) {
        this.portofolioId = portofolioId;
        this.status = status;
        this.reason = reason;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Portofolio getPortofolioId() {
        return portofolioId;
    }

    public void setPortofolioId(Portofolio portofolioId) {
        this.portofolioId = portofolioId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
