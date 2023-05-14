package com.example.domain.companyofferexpect.persistence.modell;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@Builder
public class CompanyOfferExpectDto {

    Long id;
    private Date startDate;
    private String workExperience;
    private String education;
    private String gender;


    private Long companyId;
    private Long companyOfferId;
}
