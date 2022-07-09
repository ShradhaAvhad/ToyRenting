package com.toyrent.services;

import com.toyrent.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer saveCustomer(Customer customer);

    List<Customer> getCustomer();
}
