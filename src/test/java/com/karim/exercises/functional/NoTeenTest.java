package com.karim.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NoTeenTest {

    @Test
    void noTeen() {
        assertEquals(List.of(12, 20), NoTeen.noTeen(List.of(12, 13, 15, 18, 20)));
    }
}