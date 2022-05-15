package com.example.PhotographyChest.models;


import javax.persistence.*;

@Entity
public class ActiveAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Credentials activeAccount;

    public ActiveAccount() {
    }

    public ActiveAccount(Credentials activeAccount) {
        this.activeAccount = activeAccount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Credentials getActiveAccount() {
        return activeAccount;
    }

    public void setActiveAccount(Credentials activeAccount) {
        this.activeAccount = activeAccount;
    }
}
