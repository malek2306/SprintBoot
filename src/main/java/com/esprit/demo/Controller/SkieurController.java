package com.esprit.demo.Controller;

import com.esprit.demo.Services.ISkieurService;
import com.esprit.demo.entities.Skieur;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("skieur")
public class SkieurController {

    private final ISkieurService skieurService;
//    void addSkieur(Skieur skieur){
//        this.skieurService.addSkieur(skieur);
//    }

    @PostMapping
    public Skieur addSkieur(@RequestBody Skieur skieur) {
        return skieurService.addSkieur(skieur);
    }

    @PutMapping
    public Skieur updateSkieur(@PathVariable int id, @RequestBody Skieur skieur) {
        //skieur.setId(id); // Set the ID for the provided Skieur
        return skieurService.updateSkieur(skieur);
    }

    @GetMapping
    public List<Skieur> findAll() {
        return skieurService.findAll();
    }

    @GetMapping("/{id}")
    public Skieur findById(@PathVariable int id) {
        return skieurService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        skieurService.delete(id);
    }

}
