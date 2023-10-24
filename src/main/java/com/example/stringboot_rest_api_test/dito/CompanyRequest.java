package com.example.stringboot_rest_api_test.dito;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@Data
public class CompanyRequest {
    @NotNull
    private String companyName;
    private String address;
    private String email;
    private String number;
}