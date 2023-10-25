package com.esprit.demo.Services;
import com.esprit.demo.entities.Moniteur;


import java.util.List;
public interface IMoniteurService {
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur(Moniteur moniteur);
    List<Moniteur> findAll();
    Moniteur findById(long numMoniteur);
    void delete(long numMoniteur);
}
