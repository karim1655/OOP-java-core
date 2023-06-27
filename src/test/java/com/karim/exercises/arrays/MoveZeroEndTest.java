package com.karim.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroEndTest {

    @Test
    void moveZerosEnd() {
        assertArrayEquals(new int[]{4, 2, 0, 0}, MoveZeroEnd.moveZerosEnd(new int[]{0, 0, 4, 2}));
        assertArrayEquals(new int[]{4, 2, 0, 0}, MoveZeroEnd.moveZerosEnd(new int[]{0, 4, 0, 2}));
        assertArrayEquals(new int[]{4, 2}, MoveZeroEnd.moveZerosEnd(new int[]{4, 2}));
        assertArrayEquals(new int[]{1, 0, 0}, MoveZeroEnd.moveZerosEnd(new int[]{0, 1, 0}));
        assertArrayEquals(new int[]{1, 0, 0}, MoveZeroEnd.moveZerosEnd(new int[]{0, 0, 1}));

    }
}