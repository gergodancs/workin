package com.example.domain.company.rest;

import com.example.domain.company.CompanyService;
import com.example.domain.company.persistence.modell.CompanyBaseDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/company/{companyId}")
    public CompanyBaseDto getCompany(@PathVariable Long companyId) {
        return companyService.findCompanyById(companyId);
    }

    @PostMapping("/company")
    public void createCompany(@RequestBody CompanyBaseDto company) {
        companyService.createCompany(company);
    }

    @PutMapping("/company/{companyId}")
    public void updateCompany(@PathVariable Long companyId, @RequestBody CompanyBaseDto company) {
        companyService.updateCompany(companyId, company);
    }

    @DeleteMapping("/company/{companyId}")
    public void deleteCompany(@PathVariable Long companyId) {
        companyService.deleteCompany(companyId);
    }
}
