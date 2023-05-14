package com.example.domain.userexpect.persistence.model;

import com.example.domain.profession.modell.Profession;
import com.example.domain.specialization.model.Specialization;
import com.example.domain.user.persistence.model.UserBase;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import static javax.persistence.GenerationType.IDENTITY;


@AllArgsConstructor
@Builder
@Getter
@Setter
public class UserExpectDto {

    private Long id;
    private Long minSalary;
    private String title;
    private Long specialization_id;
    private Long profession_id;
    private Long user_id;
}
