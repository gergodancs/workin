package com.example.domain.profession.rest;


import com.example.domain.profession.ProfessionService;
import com.example.domain.profession.persistence.modell.Profession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProfessionController {

    private final ProfessionService service;

    public ProfessionController(ProfessionService service) {
        this.service = service;
    }

    @GetMapping("/professions/{specId}")
    public List<Profession> getProfessions(@PathVariable Long specId){
        return service.findAllBySpecId(specId);
    }
}
