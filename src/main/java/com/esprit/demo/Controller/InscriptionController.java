package com.esprit.demo.Controller;


import com.esprit.demo.Services.IInscriptionService;
import com.esprit.demo.entities.Inscription;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class InscriptionController {
    private final IInscriptionService iInscriptionService  ;
    void addInscription(Inscription inscription)
    {
        this.iInscriptionService.addInscription(inscription);
    }

}
