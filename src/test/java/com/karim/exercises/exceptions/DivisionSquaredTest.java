package com.karim.exercises.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionSquaredTest {

    @Test
    void divisionSquared() {
        assertEquals(0, DivisionSquared.divisionSquared(1, 0));
        assertEquals(0, DivisionSquared.divisionSquared(-1, 0));
        assertEquals(1, DivisionSquared.divisionSquared(2, 2));
        assertEquals(4, DivisionSquared.divisionSquared(6, 3));

    }

}