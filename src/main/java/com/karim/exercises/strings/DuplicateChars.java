package com.karim.exercises.strings;

import java.util.Arrays;

public class DuplicateChars {
    public static char[] duplicateChars(String string) {
        String duplicatesString = "";
        char currentChar;

        for (int i = 0; i < string.length(); i++) {
            currentChar = string.charAt(i);
            for (int j = 0; j < string.length(); j++) {
                if((j != i) && (currentChar == string.charAt(j)) && !duplicatesString.contains(String.valueOf(currentChar))) {
                    duplicatesString += currentChar;
                }
            }
        }

        char[] duplicatesArray = duplicatesString.toCharArray();
        Arrays.sort(duplicatesArray);
        return duplicatesArray;
    }
}
