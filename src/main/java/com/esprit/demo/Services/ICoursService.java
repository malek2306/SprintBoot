package com.esprit.demo.Services;

import com.esprit.demo.entities.Cours;

import java.util.List;

public interface ICoursService {
    Cours addCours(Cours cours);
    Cours updateCours(Cours cours );
    List<Cours> findAll();
    Cours findById(long numCours);
    void delete(long numCours);
}
