package com.krishnadev.jobbackend.Company.impl;

import com.krishnadev.jobbackend.Company.Company;
import com.krishnadev.jobbackend.Company.CompanyRepository;
import com.krishnadev.jobbackend.Company.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    private CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getListOfCompanies() {
        return List.of();
    }
}
