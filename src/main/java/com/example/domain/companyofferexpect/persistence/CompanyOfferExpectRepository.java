package com.example.domain.companyofferexpect.persistence;

import com.example.domain.companyofferexpect.persistence.modell.CompanyOfferExpect;
import lombok.Builder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CompanyOfferExpectRepository extends JpaRepository<CompanyOfferExpect, Long> {



    @Query("SELECT c FROM CompanyOfferExpect c WHERE c.companyOffer = :companyOfferId")
   CompanyOfferExpect findByCompanyOfferId(Long companyOfferId);
}
