package com.example.stringboot_rest_api_test.dito;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDateTime;

@Getter
@Setter
@Data
public class CompanyResponse {
    @NotNull
    private String id;
    private String companyName;
    private String address;
    private String email;
    private String number;
    private boolean block;
    private LocalDateTime dateTime;
}
