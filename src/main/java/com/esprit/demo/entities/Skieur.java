package com.esprit.demo.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    int id;
    String nomS;
    String prenomS;
    Date dateNaissance;
    String ville;
    @OneToMany(mappedBy = "skieur")
    Set<Inscription> inscriptionSet; //inscripption hya li tjeri f jointture
    @ManyToMany
    Set<Piste> pisteSet;
    @OneToOne(cascade =CascadeType.ALL)
    Abonnement abonnementSet;

}
