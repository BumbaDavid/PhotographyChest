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

    @OneToOne
    private Credentials buyer;

    @OneToOne
    private Credentials owner;

    public Orders(){

    }

    public Orders(Portofolio portofolioId, String status, String reason, Credentials buyer, Credentials owner) {
        this.portofolioId = portofolioId;
        this.status = status;
        this.reason = reason;
        this.buyer = buyer;
        this.owner = owner;
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

    public Credentials getBuyer() {
        return buyer;
    }

    public void setBuyer(Credentials buyer) {
        this.buyer = buyer;
    }

    public Credentials getOwner() {
        return owner;
    }

    public void setOwner(Credentials owner) {
        this.owner = owner;
    }
}
