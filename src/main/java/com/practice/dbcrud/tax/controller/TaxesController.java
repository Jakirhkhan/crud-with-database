package com.practice.dbcrud.tax.controller;

import com.practice.dbcrud.tax.entity.Tax;
import com.practice.dbcrud.tax.service.TaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TaxesController {

    @Autowired
    private TaxService taxService;
    @GetMapping("/taxes")
    public List<Tax> getTaxes(){
        return taxService.getTaxes();
    }
    @PostMapping("/taxes")
    public void addTax(@RequestBody Tax tax){
        System.out.println("=============");
        System.out.println(tax);
        System.out.println("=============");
        taxService.addTax(tax);

    }

}
