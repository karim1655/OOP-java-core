package com.karim.exercises.strings;

public class RemoveFirstLast {
    public static String removeFirstLast(String string) {
        if(string.length() == 1) {
            return string;
        }
        if(string.charAt(0) == string.charAt(string.length() - 1)) {
             return string.substring(1, string.length() - 1);
        }

        return string;
    }
}
