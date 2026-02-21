package com.isrdc.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isrdc.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
