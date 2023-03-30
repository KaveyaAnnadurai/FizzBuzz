package com.m2p;

import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void ifNumberDivisibleByThreeReturnFizz(){

        //arrange
        FizzBuzz fizzBuzz = new FizzBuzz(6);
        String expectedValue = "fizz";

        //act
        String actualValue = fizzBuzz.checkFizzBuzz();

        //assert
        assertEquals( expectedValue, actualValue);
    }

    @Test
    void ifNumberDivisibleByFiveReturnBuzz(){

        //arrange
        FizzBuzz fizzBuzz = new FizzBuzz(25);
        String expectedValue = "buzz";

        //act
        String actualValue = fizzBuzz.checkFizzBuzz();

        //assert
        assertEquals( expectedValue, actualValue);
    }

    @Test
    void ifNumberNotDivisibleByFiveOrThreeReturnNumber(){

        //arrange
        FizzBuzz fizzBuzz = new FizzBuzz(17);
        String expectedValue = "17";

        //act
        String actualValue = fizzBuzz.checkFizzBuzz();

        //assert
        assertEquals( expectedValue, actualValue);
    }



}
