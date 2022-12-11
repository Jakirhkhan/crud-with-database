package com.practice.dbcrud.tax.service;

import com.practice.dbcrud.tax.entity.Tax;
import com.practice.dbcrud.tax.repository.TaxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxService {

    @Autowired
    private TaxRepository taxRepository;

    public List<Tax> getTaxes(){
        return (List<Tax>) taxRepository.findAll();
    }

    public void addTax(Tax tax){
        System.out.println(tax);
        taxRepository.save(tax);
    }
}
