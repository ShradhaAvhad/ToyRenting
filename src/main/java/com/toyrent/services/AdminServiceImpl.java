package com.toyrent.services;

import com.toyrent.entity.Admin;
import com.toyrent.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepository repository;

    @Override
    public Admin saveAdmin(Admin admin) {
        return repository.save(admin);
    }
}
