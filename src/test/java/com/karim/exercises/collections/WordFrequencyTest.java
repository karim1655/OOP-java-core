package com.karim.exercises.collections;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyTest {

    @Test
    void wordFrequency() throws IOException {
        String filename = "C:\\Users\\damor\\Desktop\\james-joyce-ulysses.txt";

        assertEquals(1, WordFrequency.wordFrequency(filename).get("zulu"));
        assertEquals(2, WordFrequency.wordFrequency(filename).get("velocipedes"));
        assertEquals(3, WordFrequency.wordFrequency(filename).get("bachelor"));
    }
}