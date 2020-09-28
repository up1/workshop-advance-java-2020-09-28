package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public String say(int number) {

        Rule[] rules = {new FizzBuzzRule(), new FizzRule(), new BuzzRule(), new KBTGRule()};
        for (Rule rule : rules) {
            if (rule.check(number)) {
                return rule.say();
            }
        }

        return String.format("%d", number);
    }
}
