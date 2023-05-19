package com.example.domain.companyoffer.persistence.modell;


import com.example.domain.company.persistence.modell.CompanyBase;
import com.example.domain.profession.modell.Profession;
import com.example.domain.specialization.model.Specialization;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CompanyOfferDto {
    private Long id;

    private String title;
    private String description;
    private Long minSalary;
    private Long specializationId;
    private Long professionId;
    private Long company_base_id;
}
