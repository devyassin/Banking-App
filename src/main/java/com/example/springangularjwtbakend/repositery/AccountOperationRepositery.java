package com.example.springangularjwtbakend.repositery;

import com.example.springangularjwtbakend.entities.AccountOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepositery extends JpaRepository<AccountOperation,Long> {
}
