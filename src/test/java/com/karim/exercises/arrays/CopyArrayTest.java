package com.karim.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CopyArrayTest {

    @Test
    void copyArray() {
        //assertArrayEquals(new double[]{1, 1, 1}, CopyArray.copyArray(new double[]{1, 1, 1}));
        //assertArrayEquals(new double[]{5, 4, 3, 1}, CopyArray.copyArray(new double[]{5, 4, 3, 1}));
        double[] src = new double[]{1, 2, 3, 4, 5};
        double[] dst = CopyArray.copyArray(src);
        assertArrayEquals(src, dst);
        assertTrue(5==5);
        //assertFalse(5==5);

        int[] v = new int[]{1, 2, 3, 4, 5};

    }
}