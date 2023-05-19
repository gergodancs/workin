package com.example.domain.user.rest.mapper;
import com.example.common.mapper.RestMapper;
import com.example.domain.user.persistence.model.UsersBase;
import com.example.domain.user.persistence.model.UserBaseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper extends RestMapper<UsersBase, UserBaseDto> {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
}

