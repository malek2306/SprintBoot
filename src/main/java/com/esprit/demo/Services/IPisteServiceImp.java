package com.esprit.demo.Services;

import com.esprit.demo.Repositories.PisteRepository;
import com.esprit.demo.entities.Piste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IPisteServiceImp implements  IPisteService {
    @Autowired
    PisteRepository pisteRepository;  //injectili instance dune implementation d une interface d piste repo f service
    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste); //c pas recommandee cuz kn shnbadlo atribut wahed fl piste trasilna n3adiw l piste lkolha
    }

    @Override
    public List<Piste> findAll() {
        return (List<Piste>) pisteRepository.findAll();
    }



    @Override
    public Piste findById(long id) {
       // return pisteRepository.findById(id)
             //   .orElseThrow(() -> new IllegalArgumentException("no piste found with this id"));


            return pisteRepository.findById(id).orElseThrow(()->new IllegalArgumentException("no piste with this id"));
            // return pisteRepository.findById(id).orElse();


    }
    @Override
    public void delete(long id) {
        pisteRepository.deleteById(id);

    }
}
