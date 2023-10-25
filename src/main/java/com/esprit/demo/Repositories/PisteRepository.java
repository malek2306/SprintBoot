package com.esprit.demo.Repositories;

import com.esprit.demo.entities.Piste;
import com.esprit.demo.entities.Skieur;
import org.springframework.data.repository.CrudRepository;

public interface PisteRepository extends CrudRepository<Piste,Long>  {
}
