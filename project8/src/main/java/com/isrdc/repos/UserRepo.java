package com.isrdc.repos;

import org.springframework.data.repository.CrudRepository;

import com.isrdc.entities.User;

public interface UserRepo extends CrudRepository<User, Integer> {

}
