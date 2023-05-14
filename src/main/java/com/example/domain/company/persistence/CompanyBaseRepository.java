package com.example.domain.company.persistence;

import com.example.domain.company.persistence.modell.CompanyBase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyBaseRepository extends JpaRepository<CompanyBase, Long> {
}
