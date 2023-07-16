package com.karim.exercises.functional;

import java.util.List;

public class AllPalindrome {
    public static boolean allPalindrome(List<String> strings) {
        return strings.stream()
                .allMatch((string) -> isPalindrome(string));
    }

    public static boolean isPalindrome(String string) {
        return new StringBuilder(string).reverse().toString().equals(string);
    }
}
