package com.example.Parking.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private Date DateE;
    private Date DateS;
    private Float PrixT;



    @JsonIgnore
    @ManyToOne
     private Client client;

    @OneToOne (mappedBy = "places")
    private Place place;
}
