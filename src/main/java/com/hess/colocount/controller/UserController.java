package com.hess.colocount.controller;

import com.hess.colocount.domain.User;
import com.hess.colocount.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    public User createUser(@RequestBody User user) { return userRepository.save(user); }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.POST)
    public User updateUser(@PathVariable String id, @RequestBody User user) {
        User finalUser = user;
        finalUser.setId(id);
        return userRepository.save(user);
    }
}
