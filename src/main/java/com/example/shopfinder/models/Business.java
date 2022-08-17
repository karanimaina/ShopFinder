package com.example.shopfinder.models;

import javax.persistence.*;

@Entity
@Table
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String Locaton;
    @OneToMany
    Product product;
    private String description;




}

