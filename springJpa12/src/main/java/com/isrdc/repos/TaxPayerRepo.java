package com.isrdc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isrdc.entities.TaxPayer;

public interface TaxPayerRepo extends JpaRepository<TaxPayer, Integer>{

}
