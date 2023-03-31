package com.m2p;

import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTest {

    @Test
    void ifNumberDivisibleByThreeOrHasThreeReturnFizz(){

        //arrange
        FizzBuzz fizzBuzz = new FizzBuzz(6);
        String expectedValue = "fizz";

        //act
        String actualValue = fizzBuzz.checkFizzBuzz();

        //assert
        assertEquals( expectedValue, actualValue);
    }

    @Test
    void ifNumberDivisibleByThreeOrHasThreeReturnFizzForThirtyThree(){

        //arrange
        FizzBuzz fizzBuzz = new FizzBuzz(33);
        String expectedValue = "fizz";

        //act
        String actualValue = fizzBuzz.checkFizzBuzz();

        //assert
        assertEquals( expectedValue, actualValue);
    }

    @Test
    void ifNumberDivisibleByFiveOrHasFiveReturnBuzz(){

        //arrange
        FizzBuzz fizzBuzz = new FizzBuzz(25);
        String expectedValue = "buzz";

        //act
        String actualValue = fizzBuzz.checkFizzBuzz();

        //assert
        assertEquals( expectedValue, actualValue);
    }

    @Test
    void ifNumberDivisibleByFiveOrHasFiveReturnBuzzForFiftyFive(){

        //arrange
        FizzBuzz fizzBuzz = new FizzBuzz(55);
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

    @Test
    void ifNumberDivisibleByBothThreeAndFiveReturnFizzBuzz(){
        //arrange
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        String expectedValue = "fizzbuzz";

        //act
        String actualValue = fizzBuzz.checkFizzBuzz();

        //assert
        assertEquals( expectedValue, actualValue);
    }
    @Test
    void ifNumberNotInRangeOneToHundredThrowException(){
        FizzBuzz fizzBuzz2 = new FizzBuzz(1000);

        assertThrows(IllegalArgumentException.class, () ->
                fizzBuzz2.checkFizzBuzz());
    }

}
