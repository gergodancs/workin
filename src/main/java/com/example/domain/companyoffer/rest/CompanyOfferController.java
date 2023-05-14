package com.example.domain.companyoffer.rest;


import com.example.domain.companyoffer.CompanyOfferService;
import com.example.domain.companyoffer.persistence.modell.CompanyOfferDto;
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
public class CompanyOfferController {
    private final CompanyOfferService companyOfferService;

    public CompanyOfferController(CompanyOfferService companyOfferService) {
        this.companyOfferService = companyOfferService;
    }

    @GetMapping("/company-offers/{offerId}")
    public CompanyOfferDto getCompanyOffer(@PathVariable("offerId") Long offerId) {
        return companyOfferService.findOfferById(offerId);
    }

    @PostMapping("/company-offers")
    public void createCompanyOffer(@RequestBody CompanyOfferDto companyOfferDto) {
         companyOfferService.createCompanyOffer(companyOfferDto);
    }

    @PutMapping("/company-offers")
    public void updateCompanyOffer( @RequestBody CompanyOfferDto companyOfferDto) {
        companyOfferService.updateOffer( companyOfferDto);
    }

    @DeleteMapping("/company-offers/{offerId}")
    public void deleteCompanyOffer(@PathVariable("offerId") Long offerId) {
        companyOfferService.deleteOffer(offerId);
    }
}
