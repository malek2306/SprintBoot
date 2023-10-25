package com.esprit.demo.Repositories;

import com.esprit.demo.entities.Moniteur;
import com.esprit.demo.entities.Skieur;
import org.springframework.data.repository.CrudRepository;

public interface MoniteurRepository extends CrudRepository<Moniteur,Long> {
}
