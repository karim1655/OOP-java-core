package com.karim.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodAroundTheBeginningTest {

    @Test
    void goodAroundTheBeginning() {
        assertTrue(GoodAroundTheBeginning.goodAroundTheBeginning("good"));
        assertTrue(GoodAroundTheBeginning.goodAroundTheBeginning(" good"));
        assertFalse(GoodAroundTheBeginning.goodAroundTheBeginning("  good"));
        assertFalse(GoodAroundTheBeginning.goodAroundTheBeginning("goo"));
        assertTrue(GoodAroundTheBeginning.goodAroundTheBeginning("good"));
    }
}