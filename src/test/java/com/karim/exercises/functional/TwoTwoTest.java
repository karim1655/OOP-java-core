package com.karim.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoTwoTest {

    @Test
    void twoTwo() {
        assertEquals(List.of(4, 6), TwoTwo.twoTwo(List.of(1, 2, 3)));
    }
}