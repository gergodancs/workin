package com.example.domain.user.persistence.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDataDto {
    Long id;
    private String location;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateOfBirth;
    private Long workExperience;
    private String education;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate startWorking;
    private String gender;
    private Long userId;
}
