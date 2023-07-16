package com.karim.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OneTenTest {

    @Test
    void oneTen() {
        assertEquals(List.of(20, 30, 40), OneTen.oneTen(List.of(1, 2, 3)));
    }
}