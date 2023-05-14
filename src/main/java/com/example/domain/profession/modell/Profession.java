package com.example.domain.profession.modell;


import com.example.domain.company.persistence.modell.CompanyBase;
import com.example.domain.specialization.model.Specialization;
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
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PRIVATE;
import static lombok.AccessLevel.PUBLIC;

@Entity
@Table(name = "profession")
@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor(access = PUBLIC)
@AllArgsConstructor(access = PRIVATE)
public class Profession {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    String name;

    @ManyToOne
    @JoinColumn(name = "specialization_id", referencedColumnName = "id", nullable = false)
    private Specialization specialization;
}
