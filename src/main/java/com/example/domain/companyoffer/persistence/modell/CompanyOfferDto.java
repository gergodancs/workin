package com.example.domain.companyoffer.persistence.modell;


import com.example.domain.company.persistence.modell.CompanyBase;
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
    private String specialization;
    private String profession;
    private Long company_base_id;
}
