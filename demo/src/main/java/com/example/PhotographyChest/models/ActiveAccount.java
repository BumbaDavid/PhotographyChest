package com.example.PhotographyChest.models;


import javax.persistence.*;

@Entity
public class ActiveAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Credentials activeAcccount;

    public ActiveAccount() {
    }

    public ActiveAccount(Credentials activeAcccount) {
        this.activeAcccount = activeAcccount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Credentials getActiveAcccount() {
        return activeAcccount;
    }

    public void setActiveAcccount(Credentials activeAcccount) {
        this.activeAcccount = activeAcccount;
    }
}
