package com.toyrent.controller;

import com.toyrent.entity.ToyInventory;
import com.toyrent.services.ToyInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/toys")
public class ToyController
{
    @Autowired
    ToyInventoryService toyService;
    public ToyInventory add(@Valid @RequestBody ToyInventory toyInventory)
    {
        return toyService.toyEntry(toyInventory);
    }
}
