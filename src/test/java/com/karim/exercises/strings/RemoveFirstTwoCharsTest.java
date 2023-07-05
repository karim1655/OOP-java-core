package com.karim.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstTwoCharsTest {

    @Test
    void removeFirstTwoChars() {
        assertEquals("llo!", RemoveFirstTwoChars.removeFirstTwoChars("Hello!"));
        assertEquals("", RemoveFirstTwoChars.removeFirstTwoChars("Yo"));
        assertEquals("", RemoveFirstTwoChars.removeFirstTwoChars("B"));
    }
}