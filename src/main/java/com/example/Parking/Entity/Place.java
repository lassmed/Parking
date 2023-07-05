package com.example.Parking.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private Boolean Dispo;
    private String position ;
    private Float Prix ;


    @JsonIgnore
    @ManyToOne
    private Parking parking;

    @OneToOne
    private Place places;


}
