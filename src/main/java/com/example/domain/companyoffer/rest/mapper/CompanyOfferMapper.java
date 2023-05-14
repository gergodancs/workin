package com.example.domain.companyoffer.rest.mapper;

import com.example.common.mapper.RestMapper;
import com.example.domain.companyoffer.persistence.modell.CompanyOffer;
import com.example.domain.companyoffer.persistence.modell.CompanyOfferDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface CompanyOfferMapper extends RestMapper<CompanyOffer, CompanyOfferDto> {
    CompanyOfferMapper INSTANCE = Mappers.getMapper(CompanyOfferMapper.class);
}
