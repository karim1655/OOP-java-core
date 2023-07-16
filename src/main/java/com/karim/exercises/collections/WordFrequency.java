package com.karim.exercises.collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordFrequency {
    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }

    public static Map<String, Integer> wordFrequency(String filename) throws IOException {
        List<String> lines = getLines(filename);
        List<String> allWords = new ArrayList<>();

        for(String line : lines) {
            allWords.addAll(lineToWords(line));
        }

        Map<String, Integer> wordAndCount = new HashMap<>();
        for(String word : allWords) {
            if(!wordAndCount.containsKey(word)) {
                wordAndCount.put(word, 1);
            }
            else {
                wordAndCount.put(word, wordAndCount.get(word) + 1);
            }
        }

        return wordAndCount;
    }
}
