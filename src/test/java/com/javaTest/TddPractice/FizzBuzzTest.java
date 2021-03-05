package com.javaTest.TddPractice;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    //if the number its divisible by 3 and not by 5 it would return Fizz
    @Test
    public void divisibleBy3() {
        assertTrue(FizzBuzz.fizzBuzz(3).equalsIgnoreCase("Fizz"));
        assertTrue(FizzBuzz.fizzBuzz(21).equalsIgnoreCase("Fizz"));
        assertTrue(FizzBuzz.fizzBuzz(39).equalsIgnoreCase("Fizz"));
        assertFalse(FizzBuzz.fizzBuzz(16).equalsIgnoreCase("Fizz"));
    }

    //if the number its divisible by 5 and not by 3 it would return Buzz
    @Test
    public void divisibleBy5() {
        assertTrue(FizzBuzz.fizzBuzz(95).equalsIgnoreCase("Buzz"));
        assertTrue(FizzBuzz.fizzBuzz(20).equalsIgnoreCase("Buzz"));
        assertTrue(FizzBuzz.fizzBuzz(5000).equalsIgnoreCase("Buzz"));
        assertFalse(FizzBuzz.fizzBuzz(2).equalsIgnoreCase("Buzz"));
    }

    //if the number its divisible by 3 and by 5 it would return FizzBuzz
    @Test
    public void divisibleBy5AndBy3() {
        assertTrue(FizzBuzz.fizzBuzz(15).equalsIgnoreCase("FizzBuzz"));
        assertTrue(FizzBuzz.fizzBuzz(30).equalsIgnoreCase("FizzBuzz"));
        assertTrue(FizzBuzz.fizzBuzz(3000).equalsIgnoreCase("FizzBuzz"));
        assertFalse(FizzBuzz.fizzBuzz(18).equalsIgnoreCase("FizzBuzz"));
    }
}