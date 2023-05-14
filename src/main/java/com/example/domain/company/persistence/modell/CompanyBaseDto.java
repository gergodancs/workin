package com.example.domain.company.persistence.modell;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyBaseDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
}
