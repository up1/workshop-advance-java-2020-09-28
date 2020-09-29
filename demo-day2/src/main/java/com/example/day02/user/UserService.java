package com.example.day02.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public UserDomain get(int id) {
        UserDomain userDomain = new UserDomain();
        userDomain.setId(id);
        userDomain.setFirstname("somkiat");
        userDomain.setAge(30);
        return userDomain;
    }
}
