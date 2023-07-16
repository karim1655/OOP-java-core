package com.karim.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumDigitsTest {

    @Test
    void sumDigits() {
        assertEquals(6, SumDigits.sumDigits("a1b2c3"));
        assertEquals(0, SumDigits.sumDigits("abc"));
        assertEquals(1, SumDigits.sumDigits("a1bc"));
        //assertEquals(6, SumDigits.sumDigits("a1b2c3"));
    }
}