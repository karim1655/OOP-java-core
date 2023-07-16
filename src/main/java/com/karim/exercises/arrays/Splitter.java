package com.karim.exercises.arrays;

public class Splitter {
    public static int[] splitter(int input) {
        String stringNumber = Integer.toString(input);
        char[] charArrayNumber = stringNumber.toCharArray();
        int[] digits = new int[charArrayNumber.length];

        for (int i = 0; i < charArrayNumber.length; i++) {
            digits[i] = Character.getNumericValue(charArrayNumber[i]);
        }

        return digits;
    }
}
