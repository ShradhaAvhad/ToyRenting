package com.toyrent.controller;

import com.toyrent.services.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegistrationController {
    private final Logger LOGGER = LoggerFactory.getLogger(RegistrationController.class);

    @Autowired
    private CustomerService customerService;

}
