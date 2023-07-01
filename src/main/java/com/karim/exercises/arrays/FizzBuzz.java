package com.karim.exercises.arrays;

public class FizzBuzz {
    public static String[] fizzBuzz(int start, int end) {
        String[] array = new String[end - start];
        int currentNumber;

        for(int i = 0; i < end-start; i++) {
            currentNumber = start + i;
            if(currentNumber % 3 == 0 && currentNumber % 5 == 0) {
                array[i] = "FizzBuzz";
            } else if (currentNumber % 3 == 0) {
                array[i] = "Fizz";
            } else if (currentNumber % 5 == 0) {
                array[i] = "Buzz";
            } else{
                array[i] = Integer.toString(currentNumber);
            }
        }
        return array;
    }
}
