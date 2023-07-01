package com.karim.exercises.arrays;

import java.util.Arrays;

public class CanBalance {
    public static boolean canBalance(int[] v) {
        int leftSum, rightSum;

        for (int i = 0; i < v.length; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j <= i; j++) {
                leftSum += v[j];
            }
            for (int k = i + 1; k < v.length; k++) {
                rightSum += v[k];
            }

            if(leftSum == rightSum) {
                return true;
            }
        }

        return false;
    }
}
