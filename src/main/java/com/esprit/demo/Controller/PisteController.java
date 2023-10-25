package com.esprit.demo.Controller;

import com.esprit.demo.Services.IPisteService;
import com.esprit.demo.entities.Piste;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PisteController {
    private final IPisteService iPisteService ;
    void addPiste(Piste piste)
    {
        this.iPisteService.addPiste(piste);
    }

}
