package com.example.domain.userexpect;


import com.example.domain.userexpect.persistence.UserExpectRepository;
import com.example.domain.userexpect.persistence.model.UserExpect;
import com.example.domain.userexpect.persistence.model.UserExpectDto;
import com.example.domain.userexpect.rest.mapper.UserExpectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class UserExpectService {

    private UserExpectRepository repository;

    public void createUserExpect(UserExpectDto dto){
        repository.save(UserExpectMapper.INSTANCE.fromDto(dto));
    }

    public void updateUserExpect(UserExpectDto dto){
        UserExpect original = repository.getReferenceById(dto.getId());
        repository.save(UserExpectMapper.INSTANCE.mergeToEntity(original,dto));
    }

    public void deleteUserExpect(Long userId){
        Long id = repository.findExpectByUserId(userId);
        repository.deleteById(id);
    }

}
