package com.esprit.demo.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)//les champs sont prives
public class test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
            @Setter(AccessLevel.NONE)
    long id ;
    String LastName;
}
