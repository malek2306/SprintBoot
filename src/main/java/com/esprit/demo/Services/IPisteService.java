package com.esprit.demo.Services;

import com.esprit.demo.entities.Piste;

import java.util.List;

public interface IPisteService {
    Piste addPiste(Piste piste);
    Piste updatePiste(Piste piste);
    List<Piste> findAll();



    Piste findById(long id);

    void delete(long id);
}
