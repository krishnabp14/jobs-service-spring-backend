package com.krishnadev.jobbackend.Company;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    private CompanyService companyService;


    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public List<Company> getListOfCompanies() {
        return companyService.getListOfCompanies();
    }

    @PutMapping("/{id}")
    public boolean UpdateCompanyDetails(@PathVariable Long id, @RequestBody Company company) {
        return companyService.UpdateCompanyDetails(company, id);
    }

    @PostMapping
    public void addCompany(@RequestBody Company company) {
        companyService.addCompany(company);
    }

    @DeleteMapping("/{id}")
    public String deleteCompanyById(@PathVariable Long id) {
        boolean companyDeleted = companyService.deleteCompany(id);
        if(companyDeleted) {
            return "Company Deleted Successfully";
        }
        else {
            return "Please Try Again To Delete the Company";
        }
    }

}
