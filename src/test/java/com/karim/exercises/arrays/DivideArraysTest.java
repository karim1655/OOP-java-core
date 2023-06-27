package com.karim.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideArraysTest {

    @Test
    void divideArrays() {
        assertArrayEquals(new double[]{1, 2, 3, 4}, DivideArrays.divideArrays(new double[]{5, 8, 12, 4}, new double[]{5, 4, 4, 1}));
    }
}