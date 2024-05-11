package com.example.springangularjwtbakend;


import com.example.springangularjwtbakend.entities.BankAccount;
import com.example.springangularjwtbakend.entities.CurrentAccount;
import com.example.springangularjwtbakend.entities.Customer;
import com.example.springangularjwtbakend.enums.AccountStatus;
import com.example.springangularjwtbakend.repositery.AccountOperationRepositery;
import com.example.springangularjwtbakend.repositery.BankAccountRepositery;
import com.example.springangularjwtbakend.repositery.CustomerRepositery;
import com.example.springangularjwtbakend.services.BankService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;


@SpringBootApplication
public class SpringAngularJwtBakendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAngularJwtBakendApplication.class, args);


    }

    @Bean
    CommandLineRunner start(BankService bankService){
        return  args -> {
        bankService.consulter();

        };
    }
}
