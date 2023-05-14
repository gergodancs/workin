package com.example.domain.user.rest.mapper;


import com.example.common.mapper.RestMapper;
import com.example.domain.user.persistence.model.UserData;
import com.example.domain.user.persistence.model.UserDataDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserDataMapper extends RestMapper<UserData, UserDataDto> {
    UserDataMapper INSTANCE = Mappers.getMapper(UserDataMapper.class);
}
