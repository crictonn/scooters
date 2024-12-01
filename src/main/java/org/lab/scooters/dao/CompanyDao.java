package org.lab.scooters.dao;

import org.lab.scooters.models.Company;

import java.util.List;

public interface CompanyDao {
    void saveCompany(Company company);
    void updateCompany(Company company);
    void deleteCompany(Company company);
    Company getCompanyByID(Long id);
    List<Company> getAllCompanies();
}
