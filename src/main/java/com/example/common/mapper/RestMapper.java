package com.example.common.mapper;

import org.mapstruct.MappingTarget;
import java.util.List;

public interface RestMapper<DOMAIN, DTO> {

    List<DOMAIN> fromDto(List<DTO> var1);

    List<DTO> toDto(List<DOMAIN> var1);

    DOMAIN fromDto(DTO var1);

    DTO toDto(DOMAIN var1);

    DOMAIN mergeToEntity(@MappingTarget DOMAIN original, DTO source);
}
