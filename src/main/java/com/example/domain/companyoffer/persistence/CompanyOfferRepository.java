package com.example.domain.companyoffer.persistence;

import com.example.domain.companyoffer.persistence.modell.CompanyOffer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyOfferRepository extends JpaRepository<CompanyOffer, Long> {
}
