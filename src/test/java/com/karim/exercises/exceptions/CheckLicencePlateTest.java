package com.karim.exercises.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckLicencePlateTest {

    @Test
    void checkLicencePlate() {
        assertThrows(IllegalArgumentException.class, () -> CheckLicencePlate.checkLicencePlate("AAA00AA"));
        assertDoesNotThrow(() -> CheckLicencePlate.checkLicencePlate("AA000AA"));
    }
}