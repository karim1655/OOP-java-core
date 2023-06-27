package com.karim.exercises.arrays;

public class Fibonacci {
    public static long[] fibonacci(int n) {
        switch (n) {
            case 0 -> {
                return null;
            }
            case 1 -> {
                return new long[]{0};
            }
            case 2 -> {
                return new long[]{0, 1};
            }
        }

        long[] v = new long[n];
        v[0] = 0;
        v[1] = 1;
        for(int i=2; i<n; i++){
            v[i] = v[i-1] + v[i-2];
        }

        return v;
    }
}
