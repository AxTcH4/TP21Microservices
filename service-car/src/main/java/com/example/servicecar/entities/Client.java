package com.example.servicecar.entities;

import jakarta.persistence.*;

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private Float age;

    public Client() {
        // Constructeur vide obligatoire pour JPA/Hibernate
    }

    public Client(Long id, String nom, Float age) {
        this.id = id;
        this.nom = nom;
        this.age = age;
    }
}