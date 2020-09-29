package com.example.day02.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(UserController.class)
class UserControllerWebMvcTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void success_with_user() throws Exception {
        MvcResult mvcResult = mvc.perform(get("/user/1"))
                .andExpect(status().isOk())
                .andReturn();

        String response = mvcResult.getResponse().getContentAsString();
        ObjectMapper mapper = new ObjectMapper();
        UserResponse result = mapper.readValue(response, UserResponse.class);

        assertEquals(1, result.getId());
        assertEquals("somkiat", result.getFirstname());
        assertEquals(30, result.getAge());
    }

}