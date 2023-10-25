package com.esprit.demo.entities;

import com.esprit.demo.entities.enums.Couleur;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;
import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long numPiste;
    String nomPiste;
    @Enumerated(EnumType.STRING)
    Couleur couleur;
    int longeur;
    int pente;
    @ManyToMany(mappedBy = "pisteSet")
    Set<Skieur> skieurSet;
}
