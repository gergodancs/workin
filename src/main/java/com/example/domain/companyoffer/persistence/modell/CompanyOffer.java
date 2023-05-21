package com.example.domain.companyoffer.persistence.modell;

import com.example.domain.company.persistence.modell.CompanyBase;
import com.example.domain.profession.persistence.modell.Profession;
import com.example.domain.specialization.persistence.model.Specialization;
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

import static javax.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PRIVATE;
import static lombok.AccessLevel.PUBLIC;

@Entity
@Table(name = "company_offer")
@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor(access = PUBLIC)
@AllArgsConstructor(access = PRIVATE)
public class CompanyOffer {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String title;
    private String description;
    private Long minSalary;

    @ManyToOne
    @JoinColumn(name = "company_base_id", referencedColumnName = "id", nullable = false)
    private CompanyBase company;

    @OneToOne
    @JoinColumn(name = "specialization_id", referencedColumnName = "id", nullable = false)
    private Specialization specialization;

    @OneToOne
    @JoinColumn(name = "profession_id", referencedColumnName = "id", nullable = false)
    private Profession profession;
}
