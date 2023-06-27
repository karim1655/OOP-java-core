package com.karim.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenateTest {

    @Test
    void concatenate() {
        assertEquals("Hello", Concatenate.concatenate(new String[]{"H", "ell", "o"}));
    }
}