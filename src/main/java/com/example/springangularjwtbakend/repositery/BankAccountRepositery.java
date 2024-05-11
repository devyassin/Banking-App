package com.example.springangularjwtbakend.repositery;

import com.example.springangularjwtbakend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepositery extends JpaRepository<BankAccount,String> {
}
