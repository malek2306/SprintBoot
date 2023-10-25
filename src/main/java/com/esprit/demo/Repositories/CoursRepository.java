package com.esprit.demo.Repositories;

import com.esprit.demo.entities.Cours;
import com.esprit.demo.entities.Skieur;
import org.springframework.data.repository.CrudRepository;

public interface CoursRepository extends CrudRepository<Cours,Long> {
}
