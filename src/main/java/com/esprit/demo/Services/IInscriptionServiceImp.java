package com.esprit.demo.Services;

import com.esprit.demo.Repositories.InscriptionRepository;

import com.esprit.demo.entities.Inscription;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IInscriptionServiceImp implements IInscriptionService{
    private final InscriptionRepository inscriptionRepository;

    public IInscriptionServiceImp(InscriptionRepository inscriptionRepository) {
        this.inscriptionRepository = inscriptionRepository ;
    }
    @Override
    public Inscription addInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);    }

    @Override
    public List<Inscription> findAll() {

        return (List<Inscription>) inscriptionRepository.findAll();
    }

    @Override
    public Inscription findById(long numIncription) {
        return inscriptionRepository.findById(numIncription).orElseThrow(()->new IllegalArgumentException("no Incription with this num"));
    }

    @Override
    public void delete(long numIncription) {
        inscriptionRepository.deleteById(numIncription);


    }
}
