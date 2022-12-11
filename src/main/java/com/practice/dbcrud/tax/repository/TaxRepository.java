package com.practice.dbcrud.tax.repository;

import com.practice.dbcrud.tax.entity.Tax;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxRepository extends CrudRepository<Tax, Long> {
}
