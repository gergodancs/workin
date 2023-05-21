package com.example.domain.specialization;


import com.example.domain.specialization.persistence.SpecializationRepository;
import com.example.domain.specialization.persistence.model.Specialization;
import com.example.domain.specialization.persistence.model.SpecializationDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SpecializationService {

    private SpecializationRepository repository;

   public List<Specialization> findAllSpecialization(){
        return repository.findAll();
    }

}
