package com.karim.exercises.collections;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WordAfterWordTest {
    @Test
    void wordAfterWord() throws IOException {
        final String filename = "C:\\Users\\damor\\Desktop\\james-joyce-ulysses.txt";

        assertEquals("yesterdays", WordAfterWord.wordAfterWord(filename, "yesterday"));
        assertEquals("gold", WordAfterWord.wordAfterWord(filename, "goings"));
        assertEquals("zero", WordAfterWord.wordAfterWord(filename, "zermatt"));
    }
}