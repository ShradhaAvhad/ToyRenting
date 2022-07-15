package com.toyrent.repository;

import com.toyrent.entity.ToyInventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToyInventoryRepository extends JpaRepository<ToyInventory,Long> {
}
