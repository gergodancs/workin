package com.example.domain.user;

import com.example.domain.user.persistence.UserDataRepository;
import com.example.domain.user.persistence.UserRepository;
import com.example.domain.user.persistence.model.UserBaseDto;
import com.example.domain.user.persistence.model.UserData;
import com.example.domain.user.persistence.model.UserDataDto;
import com.example.domain.user.rest.mapper.UserDataMapper;
import com.example.domain.user.rest.mapper.UserMapper;
import com.example.domain.userexpect.UserExpectService;
import com.example.domain.userexpect.persistence.UserExpectRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class UserService {

    private UserRepository userRepository;
    private UserDataRepository userDataRepository;
    private UserExpectService userExpectService;


    public void createUser(UserBaseDto user, UserDataDto userDataDto) {
        Long userId = userRepository.save(UserMapper.INSTANCE.fromDto(user)).getId();
        userDataDto.setUserId(userId);
        userDataRepository.save(UserDataMapper.INSTANCE.fromDto(userDataDto));
    }

    public void updateUser(UserDataDto userDataDto) {
        UserData original = userDataRepository.findById(userDataDto.getId()).orElseThrow();
        userDataRepository.save(UserDataMapper.INSTANCE.mergeToEntity(original, userDataDto));
    }

    public void deleteUser(Long userId) {
        UserData userData = userDataRepository.findByUserId(userId);
        userDataRepository.delete(userData);
        userRepository.deleteById(userId);
        userExpectService.deleteUserExpect(userId);


    }

}
