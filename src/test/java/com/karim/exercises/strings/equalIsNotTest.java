package com.karim.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class equalIsNotTest {

    @Test
    void equalIsNot() {
        assertFalse(EqualIsNot.equalIsNot("This is not"));
        assertTrue(EqualIsNot.equalIsNot("This is notnot"));
        assertTrue(EqualIsNot.equalIsNot("noisxxnotyynotxisi"));
    }
}