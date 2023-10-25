package com.esprit.demo.Services;

import com.esprit.demo.Repositories.AbonnementRepository;
import com.esprit.demo.entities.Abonnement;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IAbonnementServiceImp implements IAbonnementService{
    private final AbonnementRepository abonnementRepository;

    public IAbonnementServiceImp(AbonnementRepository abonnementRepository) {
        this.abonnementRepository = abonnementRepository ;
    }



    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public List<Abonnement> findAll() {
        return (List<Abonnement>) abonnementRepository.findAll();
    }

    @Override
    public Abonnement findById(long numAbon) {
        return abonnementRepository.findById(numAbon).orElseThrow(()->new IllegalArgumentException("no Abonnement with this numAbon"));
    }

    @Override
    public void delete(long numAbon) {
        abonnementRepository.deleteById(numAbon);


    }
}
