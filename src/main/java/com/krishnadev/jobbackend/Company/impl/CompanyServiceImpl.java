package com.krishnadev.jobbackend.Company.impl;

import com.krishnadev.jobbackend.Company.Company;
import com.krishnadev.jobbackend.Company.CompanyRepository;
import com.krishnadev.jobbackend.Company.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    private CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getListOfCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public boolean UpdateCompanyDetails(Company company, Long id) {
        Optional<Company> companyDetails = companyRepository.findById(id);
        if(companyDetails.isPresent()) {
            Company filteredCompany = companyDetails.get();
            filteredCompany.setName(company.getName());
            filteredCompany.setDescription(company.getDescription());
            companyRepository.save(filteredCompany);
            return true;
        }

        return false;
    }

    @Override
    public void addCompany(Company company) {
        companyRepository.save(company);
    }
}
