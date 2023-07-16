package com.karim.exercises.arrays;

import java.util.Arrays;

public class SearchArray {
    public static boolean containsBruteForce(String[] strings, String searched) {
        for(String el : strings) {
            if(el.equals(searched)) {
                return true;
            }
        }
        return false;
    }
    public static boolean containsBinary(String[] strings, String searched) {
        String[] copy = Arrays.copyOf(strings, strings.length);
        Arrays.sort(copy);
        if(Arrays.binarySearch(copy, searched) > 0) {
            return true;
        }
        return false;
    }
}
