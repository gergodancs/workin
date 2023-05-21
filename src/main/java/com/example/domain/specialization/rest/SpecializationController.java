package com.example.domain.specialization.rest;

import com.example.domain.specialization.SpecializationService;
import com.example.domain.specialization.persistence.model.Specialization;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SpecializationController {

    private final SpecializationService service;

    public SpecializationController(SpecializationService service) {
        this.service = service;
    }


    @GetMapping("/specializations")
   public List<Specialization> findAll(){
        return service.findAllSpecialization();
    }
}
