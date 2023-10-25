package com.esprit.demo.Services;

import com.esprit.demo.Repositories.CoursRepository;
import com.esprit.demo.entities.Cours;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ICoursServiceImp implements ICoursService{
    private final CoursRepository coursRepository;

    public ICoursServiceImp(CoursRepository  coursRepository) {
        this.coursRepository = coursRepository ;
    }
    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public List<Cours> findAll() {
        return (List<Cours>) coursRepository.findAll();
    }

    @Override
    public Cours findById(long numCours) {
        return coursRepository.findById(numCours).orElseThrow(()->new IllegalArgumentException("no Cours with this numCours"));
    }

    @Override
    public void delete(long numCours) {
        coursRepository.deleteById(numCours);


    }
}
