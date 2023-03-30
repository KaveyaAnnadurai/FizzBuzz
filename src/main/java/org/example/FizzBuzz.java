package org.example;

public class FizzBuzz {
    private int number;

    public FizzBuzz(int number){
        if(number > 100 || number < 1)
            throw new IllegalArgumentException();
        this.number = number;
    }

    public String checkFizzBuzz(){

        if( number % 3 == 0)
            return "fizz";
        else if(number % 5 == 0)
            return "buzz";
        else return String.valueOf(number);
    }
}