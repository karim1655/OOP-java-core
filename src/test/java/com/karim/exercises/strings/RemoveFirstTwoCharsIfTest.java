package com.karim.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstTwoCharsIfTest {

    @Test
    void removeFirstTwoCharsIf() {
        assertEquals("Hello!", RemoveFirstTwoCharsIf.removeFirstTwoCharsIf("Hello!"));
        assertEquals("od World!", RemoveFirstTwoCharsIf.removeFirstTwoCharsIf("Good World!"));
        assertEquals("H", RemoveFirstTwoCharsIf.removeFirstTwoCharsIf("Ho"));
        assertEquals("e", RemoveFirstTwoCharsIf.removeFirstTwoCharsIf("Ne"));
        assertEquals("", RemoveFirstTwoCharsIf.removeFirstTwoCharsIf("Y"));
    }
}