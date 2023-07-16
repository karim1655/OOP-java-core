package com.karim.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ValuesKeysTest {

    @Test
    void valuesKeys() {
        assertTrue(ValuesKeys.valuesKeys(new HashMap<>(Map.of("1", "1", "2", "b", "3", "c"))));
        assertFalse(ValuesKeys.valuesKeys(new HashMap<>(Map.of("1", "a", "2", "b", "3", "c"))));
    }
}