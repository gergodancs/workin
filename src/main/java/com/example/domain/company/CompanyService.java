package com.example.domain.company;


import com.example.domain.company.persistence.CompanyBaseRepository;
import com.example.domain.company.persistence.modell.CompanyBase;
import com.example.domain.company.persistence.modell.CompanyBaseDto;
import com.example.domain.company.rest.mapper.CompanyBaseMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CompanyService {

    private CompanyBaseRepository repository;

    public void createCompany(CompanyBaseDto companyDto) {
        repository.save(CompanyBaseMapper.INSTANCE.fromDto(companyDto));
    }

    public CompanyBaseDto findCompanyById(Long id) {
        CompanyBase company = repository.findById(id).orElseThrow(() -> new RuntimeException("Company not found"));
        return CompanyBaseMapper.INSTANCE.toDto(company);
    }

    public void deleteCompany(Long id) {
        repository.deleteById(id);
    }

    public void updateCompany(Long id, CompanyBaseDto companyDto) {
        CompanyBase company = repository.findById(id).orElseThrow(() -> new RuntimeException("Company not found"));
        repository.save(CompanyBaseMapper.INSTANCE.mergeToEntity(company,companyDto));
    }
}
