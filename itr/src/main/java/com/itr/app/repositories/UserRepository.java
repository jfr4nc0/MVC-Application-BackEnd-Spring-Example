package com.itr.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itr.app.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{}
