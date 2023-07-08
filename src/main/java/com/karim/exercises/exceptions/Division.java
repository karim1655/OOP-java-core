package com.karim.exercises.exceptions;

public class Division {
    public static double division(double a, double b) {
        if(b==0) {
            throw new IllegalArgumentException("Second parameter is 0, division by 0 is impossible");
        }
        return a/b;
    }
}
