package com.karim.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsEverywhereTest {

    @Test
    void isEverywhere() {
        assertTrue(IsEverywhere.isEverywhere(new int[]{1, 2, 1, 3}, 1));
        assertFalse(IsEverywhere.isEverywhere(new int[]{1, 1, 2, 3}, 1));
        assertFalse(IsEverywhere.isEverywhere(new int[]{3, 2, 1, 1}, 1));
        assertFalse(IsEverywhere.isEverywhere(new int[]{5, 2, 1, 3}, 1));
        assertTrue(IsEverywhere.isEverywhere(new int[]{2, 1, 3, 1, 4, 1, 5}, 1));
    }
}