package com.example.domain.userexpect.persistence.model;


import com.example.domain.profession.modell.Profession;
import com.example.domain.specialization.model.Specialization;
import com.example.domain.user.persistence.model.UsersBase;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
public class UserExpect {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private Long minSalary;

    private String title;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private UsersBase user_id;

    @OneToOne
    @JoinColumn(name = "specialization_id", referencedColumnName = "id", nullable = false)
    private Specialization specialization;

    @OneToOne
    @JoinColumn(name = "profession_id", referencedColumnName = "id", nullable = false)
    private Profession profession;

}
