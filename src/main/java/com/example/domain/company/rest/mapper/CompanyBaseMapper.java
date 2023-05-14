package com.example.domain.company.rest.mapper;

import com.example.common.mapper.RestMapper;
import com.example.domain.company.persistence.modell.CompanyBase;
import com.example.domain.company.persistence.modell.CompanyBaseDto;
import org.mapstruct.factory.Mappers;

public interface CompanyBaseMapper extends RestMapper<CompanyBase, CompanyBaseDto> {
    CompanyBaseMapper INSTANCE = Mappers.getMapper(CompanyBaseMapper.class);

}
