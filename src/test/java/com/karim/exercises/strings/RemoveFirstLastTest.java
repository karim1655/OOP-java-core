package com.karim.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstLastTest {

    @Test
    void removeFirstLast() {
        assertEquals("ood do", RemoveFirstLast.removeFirstLast("good dog"));
        assertEquals("good lad", RemoveFirstLast.removeFirstLast("good lad"));
        assertEquals("", RemoveFirstLast.removeFirstLast("gg"));
        assertEquals("g", RemoveFirstLast.removeFirstLast("g"));
    }
}