package com.example.stringboot_rest_api_test.controller;


import com.example.stringboot_rest_api_test.dito.CompanyRequest;
import com.example.stringboot_rest_api_test.dito.CompanyResponse;
import com.example.stringboot_rest_api_test.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/company")
public class CompanyController {


    private final CompanyService service;

    public CompanyResponse create(@RequestBody CompanyRequest compoanyRequest) {
        return service.create(compoanyRequest);
    }

    @PutMapping("{id}")
    public CompanyResponse update(@PathVariable Long id,@RequestBody CompanyRequest companyRequest){
        return service.update(id,companyRequest);
    }
    @GetMapping("{id}")
    public CompanyResponse getById(@PathVariable Long id){
        return service.getCompany(id);
    }
    public CompanyResponse deleteById(@PathVariable Long id){
        return service.deleteById(id);
    }
}
