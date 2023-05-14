package com.example.domain.companyoffer;

import com.example.domain.companyoffer.persistence.CompanyOfferRepository;
import com.example.domain.companyoffer.persistence.modell.CompanyOffer;
import com.example.domain.companyoffer.persistence.modell.CompanyOfferDto;
import com.example.domain.companyoffer.rest.mapper.CompanyOfferMapper;
import com.example.domain.companyofferexpect.CompanyOfferExpectService;
import com.example.domain.companyofferexpect.persistence.modell.CompanyOfferExpect;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class CompanyOfferService {
    private final CompanyOfferRepository repository;

    private final CompanyOfferExpectService companyOfferExpectService;

    public void createCompanyOffer(CompanyOfferDto companyOffer) {
        repository.save(CompanyOfferMapper.INSTANCE.fromDto(companyOffer));
    }

    public CompanyOfferDto findOfferById(Long id) {
        return CompanyOfferMapper.INSTANCE.toDto(repository.findById(id).orElseThrow());
    }

    public void deleteOffer(Long id) {
        companyOfferExpectService.deleteCompanyOfferExpectByOffer(id);
        repository.deleteById(id);
    }

    public void updateOffer(CompanyOfferDto companyOffer) {
        CompanyOffer original = repository.findById(companyOffer.getId()).orElseThrow();
        repository.save(CompanyOfferMapper.INSTANCE.mergeToEntity(original,companyOffer));
    }


}
