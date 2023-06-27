package com.karim.exercises.functional;

import java.util.List;

public class AllPalindrome {
    public static boolean allPalindrome(List<String> strings) {
        return strings.stream().allMatch(s -> isPalindrome(s));
    }

    public static boolean isPalindrome(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.reverse().toString().equals(string);
    }

}
