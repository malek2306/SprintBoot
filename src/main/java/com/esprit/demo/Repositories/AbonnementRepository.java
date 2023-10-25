package com.esprit.demo.Repositories;

import com.esprit.demo.entities.Abonnement;
import com.esprit.demo.entities.Skieur;
import org.springframework.data.repository.CrudRepository;

public interface AbonnementRepository extends CrudRepository<Abonnement,Long> {
}
