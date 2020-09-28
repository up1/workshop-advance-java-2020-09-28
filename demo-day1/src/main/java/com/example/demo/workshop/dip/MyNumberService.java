package com.example.demo.workshop.dip;

import java.util.Random;

public class MyNumberService {
    private MyRandom random;

    public void setRandom(MyRandom random) {
        this.random = random;
    }

    public String getData() {
        return "Your number=" + random.nextInt(10);
    }

}
