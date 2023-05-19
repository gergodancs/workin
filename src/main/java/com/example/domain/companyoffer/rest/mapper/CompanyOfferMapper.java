package com.example.domain.companyoffer.rest.mapper;

import com.example.common.mapper.RestMapper;
import com.example.domain.companyoffer.persistence.modell.CompanyOffer;
import com.example.domain.companyoffer.persistence.modell.CompanyOfferDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper
public interface CompanyOfferMapper extends RestMapper<CompanyOffer, CompanyOfferDto> {
    CompanyOfferMapper INSTANCE = Mappers.getMapper(CompanyOfferMapper.class);

    @Override
    @Mapping(target = "specialization.id", source = "specializationId")
    @Mapping(target = "profession.id", source = "professionId")
    CompanyOffer fromDto(CompanyOfferDto source);

    @Override
    @Mapping(target = "specializationId", source = "specialization.id")
    @Mapping(target = "professionId", source = "profession.id")
    CompanyOfferDto toDto(CompanyOffer source);
}
