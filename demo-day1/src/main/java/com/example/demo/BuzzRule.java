package com.example.demo;

public class BuzzRule implements Rule {
    @Override
    public boolean check(int number) {
        return number % 5 == 0;
    }

    @Override
    public String say() {
        return "Buzz";
    }
}
