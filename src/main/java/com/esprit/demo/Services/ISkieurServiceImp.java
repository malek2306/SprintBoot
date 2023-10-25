package com.esprit.demo.Services;


import com.esprit.demo.Repositories.SkieurRepository;

import com.esprit.demo.entities.Skieur;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ISkieurServiceImp implements ISkieurService{
    private final SkieurRepository skieurRepository;

    public ISkieurServiceImp(SkieurRepository skieurRepository) {
        this.skieurRepository = skieurRepository ;
    }
    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public List<Skieur> findAll() {
        return (List<Skieur>) skieurRepository.findAll();

    }

    @Override
    public Skieur findById(int id) {
        return skieurRepository.findById(id).orElseThrow(()->new IllegalArgumentException("no skieur with this id"));
    }

    @Override
    public void delete(int id) {
        skieurRepository.deleteById(id);


    }
}
