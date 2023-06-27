package com.karim.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TenRunTest {

    @Test
    void tenRun() {
        assertArrayEquals(new int[]{2, 10, 10, 20, 20, 20}, TenRun.tenRun(new int[]{2, 10, 3, 20, 4, 5}));
    }
}