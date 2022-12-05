package com.itr.app.controllers;


import org.hibernate.mapping.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itr.app.entities.User;
import com.itr.app.repositories.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	private final UserRepository userRepository;

	public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
	
    @GetMapping("/users")
    public List getUsers() {
        return (List) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }


}
