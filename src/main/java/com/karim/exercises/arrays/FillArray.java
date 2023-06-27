package com.karim.exercises.arrays;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class FillArray {
    public static double[] fillArray(int size, int value, boolean randomize) {
        double[] dst = new double[size];
        Arrays.fill(dst, value);
        if(randomize){
            RandomGenerator generator = RandomGenerator.getDefault();
            for(int i = 0; i < dst.length; i++){
                dst[i] += (generator.nextDouble() - 0.5);
            }
        }

        return dst;
    }
}
