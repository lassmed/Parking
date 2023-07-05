package com.example.Parking.Entity;


import jakarta.persistence.*;

import java.util.Set;

public class Admin extends User{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String Nom;
    private  String Prenom;


    @OneToMany(cascade = CascadeType.ALL)
    private Set<Parking> parkings;





}
