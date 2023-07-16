package com.karim.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchArrayTest {

    @Test
    void containsBruteForce() {
        assertTrue(SearchArray.containsBruteForce(new String[]{"1", "2", "3", "4", "5"}, "4"));
        assertFalse(SearchArray.containsBruteForce(new String[]{"1", "2", "3", "4", "5"}, "6"));

    }

    @Test
    void containsBinary() {
        assertTrue(SearchArray.containsBinary(new String[]{"1", "2", "3", "4", "5"}, "4"));
        assertFalse(SearchArray.containsBinary(new String[]{"1", "2", "3", "4", "5"}, "6"));
    }
}