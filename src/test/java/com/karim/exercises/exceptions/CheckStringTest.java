package com.karim.exercises.exceptions;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class CheckStringTest {

    @Test
    void checkString() {
        assertDoesNotThrow(() -> CheckString.checkString("a0b1c2d3e4"));
        assertThrows(ParseException.class, () -> CheckString.checkString("aab1c2d3e4"));

        assertThrows(ParseException.class, () -> CheckString.checkString("1q2w3e4r5t"));
        assertThrows(ParseException.class, () -> CheckString.checkString("aab3h4z1r4"));
        assertThrows(ParseException.class, () -> CheckString.checkString("a0b3h4z1rr"));
        assertThrows(ParseException.class, () -> CheckString.checkString("a"));
        assertThrows(ParseException.class, () -> CheckString.checkString("0"));
        assertDoesNotThrow(() -> CheckString.checkString("a0b3h4z1r4"));
        assertDoesNotThrow(() -> CheckString.checkString("a0"));
    }
}