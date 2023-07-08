package com.karim.exercises.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIntervalBetweenDatesAltTest {

    @Test
    void checkIntervalBetweenDatesAlt() {
        assertTrue(CheckIntervalBetweenDatesAlt.checkIntervalBetweenDatesAlt("2022-02-02", "2023-02-02"));
        assertTrue(CheckIntervalBetweenDatesAlt.checkIntervalBetweenDatesAlt("2023-02-01", "2023-02-02"));
        assertFalse(CheckIntervalBetweenDatesAlt.checkIntervalBetweenDatesAlt("2024-02-02", "2023-02-02"));
        assertFalse(CheckIntervalBetweenDatesAlt.checkIntervalBetweenDatesAlt("2024-22-02", "2023-02-02"));
        assertFalse(CheckIntervalBetweenDatesAlt.checkIntervalBetweenDatesAlt("2024-02-02", "2023-aa-02"));
    }
}