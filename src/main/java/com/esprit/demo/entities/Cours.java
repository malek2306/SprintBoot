package com.esprit.demo.entities;
import lombok.experimental.FieldDefaults;
import lombok.*;
import com.esprit.demo.entities.enums.Support;
import com.esprit.demo.entities.enums.TypeCours;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long numCours;
    double prix;
    @Enumerated(EnumType.STRING)
    TypeCours typeCours;
    @Enumerated(EnumType.STRING)
    Support support;
    int creneau;
    int niveau;
    @OneToMany(mappedBy = "cours" )//cours nom de l attribut cours fil inscription class
    Set<Inscription> inscriptionSet;



}
