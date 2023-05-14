package com.example.domain.user.persistence.model;


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
public class UserBaseDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
}
