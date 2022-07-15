package com.toyrent.controller;

import com.toyrent.entity.Admin;
import com.toyrent.entity.Customer;
import com.toyrent.entity.ToyInventory;
import com.toyrent.services.AdminService;
import com.toyrent.services.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/register")
@Slf4j
@AllArgsConstructor
public class RegistrationController {

    private CustomerService customerService;
    private AdminService adminService;

    @PostMapping("/customer")
    public Customer register(@RequestBody Customer customer) {
        log.info("Inside save method customerId={} customerName={}", customer.getId(), customer.getName());
        return customerService.saveCustomer(customer);
    }

    @PostMapping("/admin")
    public Admin register(@Valid @RequestBody Admin admin) {
        log.info("Inside save method");
        return adminService.saveAdmin(admin);
    }

    @GetMapping("/getCustomer")
    public List<Customer> getCustomerDetails() {
        return customerService.getCustomer();
    }

}
