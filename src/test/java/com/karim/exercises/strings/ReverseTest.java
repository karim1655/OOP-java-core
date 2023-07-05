package com.karim.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverse() {
        assertEquals("Forza Ferrari!", Reverse.reverse("!irarreF azroF"));
        assertEquals("Can't Stop listening to RHCP", Reverse.reverse("PCHR ot gninetsil potS t'naC"));
    }
}