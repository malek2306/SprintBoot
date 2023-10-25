package com.esprit.demo.Controller;

import com.esprit.demo.Services.IMoniteurService;
import com.esprit.demo.entities.Moniteur;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MoniteurController {
    private final IMoniteurService iMoniteurService  ;
    void addMoniteur(Moniteur moniteur)
    {
        this.iMoniteurService.addMoniteur(moniteur);
    }

}
