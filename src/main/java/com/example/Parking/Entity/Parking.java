package com.example.Parking.Entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private Boolean Full;
    private String Position ;

    @OneToMany(mappedBy = "parking" ,cascade = CascadeType.ALL)
    private Set<Place> places;


    @ManyToOne(cascade = CascadeType.ALL)
    private Admin Admin;

}
