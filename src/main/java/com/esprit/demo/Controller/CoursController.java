package com.esprit.demo.Controller;

import com.esprit.demo.Services.ICoursService;
import com.esprit.demo.entities.Cours;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("cours")
public class CoursController {
    private final ICoursService coursService; //hatina coursService mosh iCoursService besh namlo faible couplage
//    void addCours(Cours cour){
//        this.coursService.addCours(cour);
//    }

    @PostMapping
    public Cours addCours(@RequestBody Cours cour) { // requestBody bsh ybodih mn json object l cours object
        return coursService.addCours(cour);
    }

    @PutMapping
    public Cours updateCours(@PathVariable int id, @RequestBody Cours cour) {
        //cour.setId(id); // Set the ID for the provided Cours
        return coursService.updateCours(cour);
    }

    @GetMapping
    public List<Cours> findAll() {
        return coursService.findAll();
    }

    @GetMapping("/{id}")
    public Cours findById(@PathVariable int id) {
        return coursService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        coursService.delete(id);
    }

}
