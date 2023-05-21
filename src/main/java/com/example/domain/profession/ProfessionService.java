package com.example.domain.profession;


import com.example.domain.profession.persistence.ProfessionRepository;
import com.example.domain.profession.persistence.modell.Profession;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProfessionService {

    private ProfessionRepository repository;

    public List<Profession> findAllBySpecId(Long specializationId) {
        return repository.findProfessionsBySpecializationId(specializationId);
    }


}
