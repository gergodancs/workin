package com.example.domain.companyofferexpect.rest.mapper;

import com.example.common.mapper.RestMapper;
import com.example.domain.companyoffer.rest.mapper.CompanyOfferMapper;
import com.example.domain.companyofferexpect.persistence.modell.CompanyOfferExpect;
import com.example.domain.companyofferexpect.persistence.modell.CompanyOfferExpectDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CompanyOfferExpectMapper extends RestMapper<CompanyOfferExpect, CompanyOfferExpectDto> {
    CompanyOfferExpectMapper INSTANCE = Mappers.getMapper(CompanyOfferExpectMapper.class);

}
