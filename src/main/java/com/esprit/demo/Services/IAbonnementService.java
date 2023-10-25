package com.esprit.demo.Services;

import com.esprit.demo.entities.Abonnement;


import java.util.List;

public interface IAbonnementService {
    Abonnement addAbonnement(Abonnement abonnement );
    Abonnement updateAbonnement(Abonnement abonnement );
    List<Abonnement> findAll();
    Abonnement findById(long numAbon);
    void delete(long numAbon);
}
