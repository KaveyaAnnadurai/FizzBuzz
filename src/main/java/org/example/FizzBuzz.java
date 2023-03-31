package org.example;

public class FizzBuzz {
    private int number;

    public FizzBuzz(int number){
        this.number = number;
    }
    public boolean toCheckIfDigitIsPresentInNumber(int number, int digit){
        int unitsDigit;
        while(number > 0){
            unitsDigit = number%10;

            if(unitsDigit == digit)
                return true;
        }
        return false;
    }
    public String checkFizzBuzz(){
        if(number > 100 || number < 1)
            throw new IllegalArgumentException();
        if(number % 3 ==0 && number % 5 == 0)
            return "fizzbuzz";
        if( number % 3 == 0 || toCheckIfDigitIsPresentInNumber(number,3))
            return "fizz";
        else if(number % 5 == 0 || toCheckIfDigitIsPresentInNumber(number,5))
            return "buzz";
        else return String.valueOf(number);
    }
}