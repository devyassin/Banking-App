package com.example.springangularjwtbakend.repositery;

import com.example.springangularjwtbakend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositery extends JpaRepository<Customer,Long> {
}
