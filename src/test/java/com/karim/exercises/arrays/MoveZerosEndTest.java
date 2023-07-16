package com.karim.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZerosEndTest {

    @Test
    void moveZerosEnd() {
        assertArrayEquals(new int[]{4, 2, 0, 0}, MoveZerosEnd.moveZerosEnd(new int[]{0, 0, 4, 2}));
        assertArrayEquals(new int[]{4, 2, 0, 0}, MoveZerosEnd.moveZerosEnd(new int[]{0, 4, 0, 2}));
        assertArrayEquals(new int[]{4, 2}, MoveZerosEnd.moveZerosEnd(new int[]{4, 2}));
        assertArrayEquals(new int[]{1, 0, 0}, MoveZerosEnd.moveZerosEnd(new int[]{0, 1, 0}));
        assertArrayEquals(new int[]{1, 0, 0}, MoveZerosEnd.moveZerosEnd(new int[]{0, 0, 1}));

    }
}