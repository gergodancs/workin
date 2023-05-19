package com.example.domain.userexpect.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Builder
@Getter
@Setter
public class UserExpectDto {

    private Long id;
    private Long minSalary;
    private String title;
    private Long specializationId;
    private Long professionId;
    private Long userId;
}
