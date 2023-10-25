package com.esprit.demo.Controller;

import com.esprit.demo.Services.IAbonnementService;
import com.esprit.demo.entities.Abonnement;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class AbonnementController {
    private final IAbonnementService iAbonnementService ;
    void addAbonnement (Abonnement abonnement)
    {this.iAbonnementService.addAbonnement(abonnement);}
    void  UpdateAbonnement (Abonnement abonnement)
    {this.iAbonnementService.addAbonnement(abonnement);}
    void  ListAbonnement (Abonnement abonnement)
    {this.iAbonnementService.findAll();}
    void findbyId (long NumAbon)
    {this.iAbonnementService.findById( NumAbon);}
    void DeleteAbonnement (long NumAbon)
    {this.iAbonnementService.delete(NumAbon);}
}