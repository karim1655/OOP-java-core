package com.karim.exercises.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void division() {
        assertThrows(IllegalArgumentException.class, () -> Division.division(1, 0));
        assertThrows(IllegalArgumentException.class, () -> Division.division(-1, 0));
        assertEquals(2, Division.division(2, 1));
        assertEquals(1.5, Division.division(4.5, 3));

    }
}