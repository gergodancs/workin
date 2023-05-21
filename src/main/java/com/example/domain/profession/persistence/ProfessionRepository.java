package com.example.domain.profession.persistence;


import com.example.domain.profession.persistence.modell.Profession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessionRepository extends JpaRepository<Profession,Long> {

    List<Profession> findProfessionsBySpecializationId(Long id);
}
