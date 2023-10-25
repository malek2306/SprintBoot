package com.esprit.demo.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long numIncription;
    int numSemaine;
    @ManyToOne
    Cours cours;
    @ManyToOne
    Skieur skieur;

}
