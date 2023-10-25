package com.esprit.demo.Services;

import com.esprit.demo.Repositories.MoniteurRepository;

import com.esprit.demo.entities.Moniteur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IMoniteurServiceImp implements IMoniteurService {
    //@Autowired // ma t5demsh haja final
    //MoniteurRepository moniteurRepository;
    private final MoniteurRepository moniteurRepository; //Cette ligne déclare un champ privé et final nommé moniteurRepository de type MoniteurRepository. Le mot-clé final signifie que la valeur du champ ne peut pas être modifiée après son initialisation. Ce champ va stocker une instance de la classe MoniteurRepository, qui est un référentiel Spring utilisé pour interagir avec la base de données.

    public IMoniteurServiceImp(MoniteurRepository moniteurRepository) { //Cette ligne définit un constructeur pour la classe IMoniteurServiceImp. Le constructeur prend un seul paramètre, de type MoniteurRepository. Il s'agit d'une injection de dépendance basée sur le constructeur, ce qui signifie qu'à la création d'une instance de IMoniteurServiceImp, une instance MoniteurRepository doit être fournie.
        this.moniteurRepository = moniteurRepository; //Cette ligne initialise le champ moniteurRepository avec l'instance MoniteurRepository passée en paramètre au constructeur. Elle définit le champ moniteurRepository pour qu'il fasse référence à l'instance MoniteurRepository fournie, la rendant ainsi disponible pour une utilisation dans les méthodes de la classe.
    }
    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public List<Moniteur> findAll() {
        return (List<Moniteur>) moniteurRepository.findAll();
    }

    @Override
    public Moniteur findById(long numMoniteur) {
        return moniteurRepository.findById(numMoniteur).orElseThrow(()->new IllegalArgumentException("no moniteur with this num"));
    }

    @Override
    public void delete(long numMoniteur) {
        moniteurRepository.deleteById(numMoniteur);


    }
}
