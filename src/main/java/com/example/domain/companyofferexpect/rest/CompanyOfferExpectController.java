package com.example.domain.companyofferexpect.rest;


import com.example.domain.companyofferexpect.CompanyOfferExpectService;
import com.example.domain.companyofferexpect.persistence.modell.CompanyOfferExpectDto;
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
public class CompanyOfferExpectController {

    private final CompanyOfferExpectService service;

    public CompanyOfferExpectController(CompanyOfferExpectService service) {
        this.service = service;
    }

    @GetMapping("/company-offer-expect/{expectId}")
    public CompanyOfferExpectDto getCompanyOfferExpectById(@PathVariable("expectId") Long expectId) {
        return service.findCompanyOfferExpectById(expectId);
    }

    @PostMapping("/company-offer-expect")
    public void createCompanyOfferExpect(@RequestBody CompanyOfferExpectDto companyOfferExpectDto) {
        service.createCompanyOfferExpect(companyOfferExpectDto);
    }

    @PutMapping("/company-offer-expect")
    public void updateCompanyOfferExpect(@RequestBody CompanyOfferExpectDto companyOfferExpectDto) {
        service.updateCompanyOfferExpect(companyOfferExpectDto);
    }

    @DeleteMapping("/company-offer-expect/{expectId}")
    public void deleteCompanyOfferExpect(@PathVariable("expectId") Long expectId) {
        service.deleteCompanyOfferExpect(expectId);
    }

}
