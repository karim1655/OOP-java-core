package com.karim.exercises.strings;

public class SumDigits {
    public static int sumDigits(String string) {
        int sum = 0;

        for(Character c : string.toCharArray()) {
            if(Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }

        return sum;
    }

}
