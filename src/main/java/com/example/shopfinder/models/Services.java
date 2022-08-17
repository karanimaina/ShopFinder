package com.example.shopfinder.models;

import javax.persistence.*;

@Entity
@Table
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @ManyToOne
    private Business business

}
