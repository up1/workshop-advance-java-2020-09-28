package com.example.demo;

public class FizzRule implements Rule {
    public boolean check(int number) {
        return number % 3 == 0;
    }

    public String say() {
        return "Fizz";
    }
}
