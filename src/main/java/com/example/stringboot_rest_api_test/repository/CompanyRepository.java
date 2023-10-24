package com.example.stringboot_rest_api_test.repository;

import com.example.stringboot_rest_api_test.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company,Long> {

    @Override
    List<Company> findAll();


    @Override
    <S extends Company> S save(S entity);

    @Override
    Optional<Company> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}
