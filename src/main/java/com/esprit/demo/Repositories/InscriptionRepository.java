package com.esprit.demo.Repositories;

import com.esprit.demo.entities.Inscription;
import com.esprit.demo.entities.Skieur;
import org.springframework.data.repository.CrudRepository;

public interface InscriptionRepository extends CrudRepository <Inscription,Long> {
}
