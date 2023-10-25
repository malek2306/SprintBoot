package com.esprit.demo.Services;

import com.esprit.demo.entities.Inscription;


import java.util.List;

public interface IInscriptionService {
    Inscription addInscription(Inscription inscription);
    Inscription updateInscription(Inscription inscription);
    List<Inscription> findAll();
    Inscription findById(long numIncription);
    void delete(long numIncription);
}
