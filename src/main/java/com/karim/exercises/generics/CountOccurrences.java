package com.karim.exercises.generics;

import java.util.Arrays;

public class CountOccurrences {
    public static <T> int countOccurrences(T[] src, T item) {
        int count = 0;
        if(item == null) {
            for(T element : src) {
                if(element == null)
                    count++;
            }
        }
        else {
            for(T element : src) {
                if(element.equals(item))
                    count++;
            }
        }
        return count;
    }

}
