package com.esprit.demo.Services;


import com.esprit.demo.entities.Skieur;

import java.util.List;

public interface ISkieurService {
    Skieur addSkieur(Skieur skieur);
    Skieur updateSkieur(Skieur skieur );
    List<Skieur> findAll();
    Skieur findById(int id);
    void delete(int id);
}
