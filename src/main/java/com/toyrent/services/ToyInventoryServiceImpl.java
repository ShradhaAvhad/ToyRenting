package com.toyrent.services;

import com.toyrent.entity.ToyInventory;
import com.toyrent.repository.ToyInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToyInventoryServiceImpl implements ToyInventoryService
{
    @Autowired
    ToyInventoryRepository toyInventoryRepository;

    @Override
    public ToyInventory toyEntry(ToyInventory toyInventory) {
        return toyInventoryRepository.save(toyInventory);
    }
}
