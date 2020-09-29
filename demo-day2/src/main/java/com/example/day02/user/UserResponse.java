package com.example.day02.user;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserResponse {
    private int id;
    private String firstname;
    private int age;

    public UserResponse() {
    }

    public UserResponse(int id, String firstname, int age) {
        this.id = id;
        this.firstname = firstname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
