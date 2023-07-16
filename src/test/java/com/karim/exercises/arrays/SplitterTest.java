package com.karim.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitterTest {

    @Test
    void splitter() {
        assertArrayEquals(new int[]{3, 2, 1}, Splitter.splitter(321));
        assertArrayEquals(new int[]{4, 7, 1, 0}, Splitter.splitter(4710));
        assertArrayEquals(new int[]{0}, Splitter.splitter(0));
        assertArrayEquals(new int[]{1, 0}, Splitter.splitter(10));
    }
}