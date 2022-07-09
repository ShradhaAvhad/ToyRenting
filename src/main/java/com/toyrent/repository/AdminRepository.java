package com.toyrent.repository;

import com.toyrent.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

}
