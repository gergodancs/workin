package com.example.domain.specialization.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PRIVATE;
import static lombok.AccessLevel.PUBLIC;

@Entity
@Table(name = "user_expect")
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
}
