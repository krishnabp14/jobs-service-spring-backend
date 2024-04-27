package com.krishnadev.jobbackend.Company;

import org.springframework.stereotype.Service;

import java.util.List;

public interface CompanyService {
    List<Company> getListOfCompanies();
    boolean UpdateCompanyDetails(Company company, Long id);
    void addCompany(Company company);
}
