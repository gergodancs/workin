package com.example.domain.specialization.persistence;

import com.example.domain.specialization.persistence.model.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecializationRepository extends JpaRepository<Specialization,Long> {
}
