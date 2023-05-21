package com.example.domain.specialization.persistence.model;


import com.example.domain.profession.persistence.modell.Profession;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PRIVATE;
import static lombok.AccessLevel.PUBLIC;

@Entity
@Table(name = "specialization")
@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor(access = PUBLIC)
@AllArgsConstructor(access = PRIVATE)
public class Specialization {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String name;

 /*   @OneToMany
    private List<Profession> professions;*/

}
