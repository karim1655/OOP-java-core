package com.karim.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SquareFiveTest {

    @Test
    void squareFive() {
        assertEquals(3, SquareFive.squareFive(List.of(3, 1, 4)));
    }
}