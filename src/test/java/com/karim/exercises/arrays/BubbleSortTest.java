package com.karim.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void bubbleSort() {
        int[] v1 = {6, 3, 4, 2};
        BubbleSort.bubbleSort(v1);
        assertArrayEquals(new int[]{2, 3, 4, 6}, v1);
    }

    @Test
    void bubbleSortCopy() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, BubbleSort.bubbleSortCopy(new int[]{5, 1, 4, 2, 3}));
    }
}