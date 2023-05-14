package com.example.domain.user.persistence.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDataDto {
    Long id;
    private String location;
    private String dateOfBirth;
    private Long workExperience;
    private String education;
    private Date startWorking;
    private String gender;
    private Long userId;
}
