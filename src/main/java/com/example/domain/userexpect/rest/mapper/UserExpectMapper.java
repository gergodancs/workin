package com.example.domain.userexpect.rest.mapper;

import com.example.common.mapper.RestMapper;
import com.example.domain.userexpect.persistence.model.UserExpect;
import com.example.domain.userexpect.persistence.model.UserExpectDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserExpectMapper extends RestMapper<UserExpect, UserExpectDto> {

    UserExpectMapper INSTANCE = Mappers.getMapper(UserExpectMapper.class);
}
