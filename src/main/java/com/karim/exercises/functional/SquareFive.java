package com.karim.exercises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class SquareFive {
    public static long squareFive(List<Integer> nums) {
        return nums.stream()
                .map((num) -> Math.sqrt(num) + 10)
                .filter((num) -> num % 10 != 5)
                .count();
    }
}
