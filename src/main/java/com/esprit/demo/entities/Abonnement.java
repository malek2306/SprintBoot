package com.esprit.demo.entities;

import com.esprit.demo.entities.enums.TypeAbonnement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long numAbon ;
    Date dateDebut ;
    Date dateFin;
    float prixAbon;
    @Enumerated(EnumType.STRING)
    TypeAbonnement typeAbon ;


}
