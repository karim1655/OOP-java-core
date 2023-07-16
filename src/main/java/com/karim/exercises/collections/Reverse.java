package com.karim.exercises.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Reverse {
    public static List<String> reverse(List<String> sentence) {
        Deque<String> stack = new ArrayDeque<>(sentence);
        List<String> reversedSentence = new ArrayList<>();

        while(!stack.isEmpty()) {
            reversedSentence.add(stack.pollLast());
        }

        return reversedSentence;
    }
}
