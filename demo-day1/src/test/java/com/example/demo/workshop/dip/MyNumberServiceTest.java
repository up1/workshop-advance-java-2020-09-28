package com.example.demo.workshop.dip;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

// Stub
class Random7 implements MyRandom {
    @Override
    public int nextInt(int bound) {
        return 7;
    }
}

class MyNumberServiceTest {

    @Test
    public void case_random_with_7() {
        MyNumberService myNumberService = new MyNumberService();
        myNumberService.setRandom(new Random7());
        String result = myNumberService.getData();
        assertEquals("Your number=7", result);
    }

}