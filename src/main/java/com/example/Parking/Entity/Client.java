package com.example.Parking.Entity;

import jakarta.persistence.*;

import java.util.Set;

public class Client extends User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private Long CIN;
    private Long Matricule;
    private Long Telephone;

    @OneToMany(mappedBy = "client" ,cascade = CascadeType.ALL)
    private Set<Reservation> Reservations;

}
