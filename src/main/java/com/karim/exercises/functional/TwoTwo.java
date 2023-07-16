package com.karim.exercises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class TwoTwo {
    public static List<Integer> twoTwo(List<Integer> nums) {
        return nums.stream()
                .map((num) -> num * 2)
                .filter((num) -> num % 10 != 2)
                .collect(Collectors.toList());
    }
}
