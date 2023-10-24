package com.example.stringboot_rest_api_test.mapper;

import com.example.stringboot_rest_api_test.dito.CompanyResponse;
import com.example.stringboot_rest_api_test.entity.Company;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompanyViewMapper {
    public CompanyResponse viewCompany(Company company) {
        if (company == null) {
            return null;
        }
        CompanyResponse response = new CompanyResponse();
        if (company.getId() != null) {
            response.setId(String.valueOf(company.getId()));
        }
        response.setCompanyName(company.getCompanyName());
        response.setAddress(company.getAddress());
        response.setEmail(company.getEmail());
        response.setBlock(company.isBlocked());
        response.setNumber(company.getNumber());
        response.setDateTime(company.getCreatAt());

        return response;
    }
    public List<CompanyResponse>viewCompanies(List<Company> companies){
        List<CompanyResponse> responses = new ArrayList<>();
        for (Company c : companies) {
            responses.add(viewCompany(c));
        }
        return responses;
    }
}
