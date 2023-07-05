package com.karim.exercises.strings;

public class Reverse {
    public static String reverse(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = string.length() - 1; i >= 0 ; i--) {
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();

        // oppure come i pro
        // return new StringBuilder(string).reverse().toString();
    }
}
