package com.example.stringboot_rest_api_test.mapper;

import com.example.stringboot_rest_api_test.dito.CompanyRequest;
import com.example.stringboot_rest_api_test.entity.Company;
import org.springframework.stereotype.Component;

@Component
public class CompanyEditMapper {
    public Company create (CompanyRequest companyRequest){
        if (companyRequest==null){
            return null;
        }
        Company company = new Company();
        company.setCompanyName(companyRequest.getCompanyName());
        company.setAddress(companyRequest.getAddress());
        company.setNumber(companyRequest.getNumber());
        company.setEmail(companyRequest.getEmail());

        return company;
    }
    public void update (Company company,CompanyRequest companyRequest){
        company.setCompanyName(companyRequest.getCompanyName());
        company.setAddress(companyRequest.getAddress());
        company.setNumber(companyRequest.getNumber());
        company.setEmail(companyRequest.getEmail());
    }
}
