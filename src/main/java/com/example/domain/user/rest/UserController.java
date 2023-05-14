package com.example.domain.user.rest;


import com.example.domain.user.UserService;
import com.example.domain.user.persistence.model.UserBaseDto;
import com.example.domain.user.persistence.model.UserData;
import com.example.domain.user.persistence.model.UserDataDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/user")
    public void createUser(@RequestBody UserBaseDto userBaseDto, UserDataDto userDataDto) {
        userService.createUser(userBaseDto, userDataDto);
    }

    @PutMapping("/user")
    public void updateUser(@RequestBody UserDataDto userData) {
        userService.updateUser(userData);

    }

    @DeleteMapping("/user/{userId}")
    public void deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
    }
}
