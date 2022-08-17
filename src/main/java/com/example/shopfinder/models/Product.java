package com.example.shopfinder.models;

import javax.persistence.*;

@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String price;
    private String quality;
    @ManyToOne
    private Business business;
    private String weight;

}
