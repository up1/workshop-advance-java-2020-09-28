package com.example.day02.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/{id}")
    public UserResponse getById(@PathVariable int id) {
        return new UserResponse(id, "somkiat", 30);
    }

}