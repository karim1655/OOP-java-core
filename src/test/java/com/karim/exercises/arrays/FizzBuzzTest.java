package com.karim.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzz() {
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, FizzBuzz.fizzBuzz(1, 6));
        //assertEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, FizzBuzz.fizzBuzz(1, 6));   occhio che con assertEquals dà errore -> per array usa sempre assertArrayEquals
    }
}