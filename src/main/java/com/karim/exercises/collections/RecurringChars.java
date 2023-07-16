package com.karim.exercises.collections;

import java.util.HashSet;
import java.util.Set;

public class RecurringChars {
    public static Set<Character> recurringChars(String string) {
        //di fatto stesso meccanismo di DuplicateChars nel package strings, solo che hai mezzi diversi per farlo

        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();
        char[] stringArray = string.toCharArray();

        for(char c : stringArray) {
            if(!seen.contains(c))
                seen.add(c);
            else
                duplicates.add(c);
        }

        return duplicates;
    }
}
