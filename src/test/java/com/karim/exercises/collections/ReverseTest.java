package com.karim.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverse() {
        assertEquals(List.of("well", "is", "All"), Reverse.reverse(List.of("All", "is", "well")));
        assertEquals(List.of("giggity", "giggity", "Giggity"), Reverse.reverse(List.of("Giggity", "giggity", "giggity")));
    }
}