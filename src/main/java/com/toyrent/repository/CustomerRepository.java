package com.toyrent.repository;

import com.toyrent.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
