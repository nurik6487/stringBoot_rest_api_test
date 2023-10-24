package com.example.stringboot_rest_api_test.service;

import com.example.stringboot_rest_api_test.dito.CompanyRequest;
import com.example.stringboot_rest_api_test.dito.CompanyResponse;
import com.example.stringboot_rest_api_test.entity.Company;
import com.example.stringboot_rest_api_test.mapper.CompanyEditMapper;
import com.example.stringboot_rest_api_test.mapper.CompanyViewMapper;
import com.example.stringboot_rest_api_test.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyService  {


    private final CompanyViewMapper viewMapper;
    private final CompanyRepository repository;
    private  final CompanyEditMapper editMapper;


    public CompanyResponse create (CompanyRequest companyRequest){
        return viewMapper.viewCompany(repository.save
                (editMapper.create(companyRequest)));
    }
    public CompanyResponse update (Long id, CompanyRequest companyRequest){
        Company company = repository.findById(id).get();
        editMapper.update(company,companyRequest);
        return viewMapper.viewCompany(repository.save(company));
    }
    public CompanyResponse getCompany(Long id){
        return viewMapper.viewCompany(repository.findById(id).get());
    }
    public CompanyResponse deleteById(Long id){
        Company company = repository.findById(id).get();
        repository.deleteById(id);
        return viewMapper.viewCompany(company);
    }
}
