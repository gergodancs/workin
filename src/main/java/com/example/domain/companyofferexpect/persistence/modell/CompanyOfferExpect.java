package com.example.domain.companyofferexpect.persistence.modell;


import com.example.domain.company.persistence.modell.CompanyBase;
import com.example.domain.companyoffer.persistence.modell.CompanyOffer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PRIVATE;
import static lombok.AccessLevel.PUBLIC;

@Entity
@Table(name = "company_offer_expect")
@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor(access = PUBLIC)
@AllArgsConstructor(access = PRIVATE)
public class CompanyOfferExpect {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    Long id;
    private Date startDate;
    private String workExperience;
    private String education;
    private String gender;

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "id", nullable = false)
    private CompanyBase company;

    @OneToOne
    @JoinColumn(name = "company_offer_id", referencedColumnName = "id", nullable = false)
    private CompanyOffer companyOffer;
}
