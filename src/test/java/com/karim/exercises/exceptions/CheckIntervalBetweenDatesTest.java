package com.karim.exercises.exceptions;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.*;

class CheckIntervalBetweenDatesTest {

    @Test
    void checkIntervalBetweenDates() {
        try {
            assertTrue(CheckIntervalBetweenDates.checkIntervalBetweenDates("2022-02-02", "2023-02-02"));
        } catch (ParseException e) {
            // ignored
        }

        assertThrows(DateTimeParseException.class, () -> CheckIntervalBetweenDates.checkIntervalBetweenDates("15-12-2022", "17/12/2022"));
        assertThrows(DateTimeParseException.class, () -> CheckIntervalBetweenDates.checkIntervalBetweenDates("15/12-2022", "17/12-2022"));
        assertThrows(DateTimeParseException.class, () -> CheckIntervalBetweenDates.checkIntervalBetweenDates("15-32-2022", "17/12-20oo"));
    }
}