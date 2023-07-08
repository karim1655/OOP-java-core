package com.karim.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodAtTheBeginningTest {

    @Test
    void goodAtTheBeginning() {
        assertTrue(GoodAtTheBeginning.goodAtTheBeginning("good time"));
        assertFalse(GoodAtTheBeginning.goodAtTheBeginning("goo time"));
        assertTrue(GoodAtTheBeginning.goodAtTheBeginning("goodd time"));
        assertFalse(GoodAtTheBeginning.goodAtTheBeginning("goo"));
    }
}