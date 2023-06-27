package com.karim.exercises.arrays;

public class DivideArray {
    public static double[] divideArray(double[] v, double factor) {
        double[] dividedVector = new double[v.length];
        for(int i = 0; i < dividedVector.length; i++) {

            dividedVector[i] = v[i] / factor;
        }
        return dividedVector;
    }
}
