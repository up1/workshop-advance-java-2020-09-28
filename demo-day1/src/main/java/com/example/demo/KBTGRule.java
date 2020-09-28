package com.example.demo;

public class KBTGRule implements Rule {
    @Override
    public boolean check(int number) {
        return number%7 ==0;
    }

    @Override
    public String say() {
        return "KBTG";
    }
}
