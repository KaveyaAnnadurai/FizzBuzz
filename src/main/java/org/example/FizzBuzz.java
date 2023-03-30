package org.example;

public class FizzBuzz {
    private int number;

    public FizzBuzz(int number){
        if(number > 100 || number < 1)
            throw new IllegalArgumentException();
        this.number = number;
    }
}