package com.example.demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void case04() {
        String result = fizzBuzz.say(7);
        assertEquals("KBTG", result);
    }

    @Test
    public void case03() {
        String result = fizzBuzz.say(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void case02() {
        String result = fizzBuzz.say(2);
        assertEquals("2", result);
    }

    @Test
    @DisplayName("กำลังทดสอบนะ ดเกดเ กดเกดเ กดเกดเ")
    public void case01() {
        String result = fizzBuzz.say(1);
        assertEquals("1", result);
    }

}