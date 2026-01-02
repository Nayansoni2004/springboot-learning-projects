package com.isrdc.repos;

import org.springframework.data.repository.CrudRepository;

import com.isrdc.entities.Users;

public interface UserRepo extends CrudRepository<Users, Integer> {

}
