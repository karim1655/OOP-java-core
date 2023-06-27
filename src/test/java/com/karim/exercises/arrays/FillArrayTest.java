package com.karim.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FillArrayTest {

    @Test
    void fillArray() {
        assertArrayEquals(new double[]{1, 1, 1}, FillArray.fillArray(3, 1, false));
        assertArrayEquals(new double[]{5, 5, 5, 5, 5}, FillArray.fillArray(5, 5, false));
    }
}