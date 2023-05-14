package com.example.domain.companyofferexpect;


import com.example.domain.companyofferexpect.persistence.CompanyOfferExpectRepository;
import com.example.domain.companyofferexpect.persistence.modell.CompanyOfferExpect;
import com.example.domain.companyofferexpect.persistence.modell.CompanyOfferExpectDto;
import com.example.domain.companyofferexpect.rest.mapper.CompanyOfferExpectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class CompanyOfferExpectService {
    private final CompanyOfferExpectRepository companyOfferExpectRepository;


    public CompanyOfferExpectDto findCompanyOfferExpectById(Long id) {
        CompanyOfferExpect companyOfferExpect = companyOfferExpectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("CompanyOfferExpect not found"));
        return CompanyOfferExpectMapper.INSTANCE.toDto(companyOfferExpect);
    }

    public void deleteCompanyOfferExpectByOffer(Long offerId) {
        CompanyOfferExpect companyOfferExpect = companyOfferExpectRepository.findByCompanyOfferId(offerId);
        companyOfferExpectRepository.delete(companyOfferExpect);
    }

    public void createCompanyOfferExpect(CompanyOfferExpectDto companyOfferExpect) {
        companyOfferExpectRepository.save(CompanyOfferExpectMapper.INSTANCE.fromDto(companyOfferExpect));
    }

    public void updateCompanyOfferExpect(CompanyOfferExpectDto companyOfferExpect) {
        CompanyOfferExpect original = companyOfferExpectRepository.findById(companyOfferExpect.getId())
                .orElseThrow(() -> new RuntimeException("CompanyOfferExpect not found"));
        companyOfferExpectRepository.save(CompanyOfferExpectMapper.INSTANCE.mergeToEntity(original, companyOfferExpect));
    }

    public void deleteCompanyOfferExpect(Long id) {
        companyOfferExpectRepository.deleteById(id);
    }
}
