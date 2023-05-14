package com.example.domain.userexpect.rest;


import com.example.domain.userexpect.UserExpectService;
import com.example.domain.userexpect.persistence.model.UserExpectDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserExpectController {

    private final UserExpectService service;


    public UserExpectController(UserExpectService service) {
        this.service = service;
    }

    @PostMapping("/user-expect")
    public void createUserExpect(@RequestBody UserExpectDto dto) {
        service.createUserExpect(dto);
    }

    @PutMapping("/user-expect")
    public void updateUserExpect(@RequestBody UserExpectDto dto) {
        service.updateUserExpect(dto);
    }

}
