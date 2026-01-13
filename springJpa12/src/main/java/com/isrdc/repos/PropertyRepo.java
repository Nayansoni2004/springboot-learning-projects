package com.isrdc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isrdc.entities.Property;

public interface PropertyRepo extends JpaRepository<Property, Integer>{

}
