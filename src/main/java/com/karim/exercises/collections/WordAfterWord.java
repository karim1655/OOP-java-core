package com.karim.exercises.collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordAfterWord {
    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }

    public static String wordAfterWord(String filename, String word) throws IOException {
        TreeSet<String> allWordsWithoutDuplicates = new TreeSet<>();
        List<String> lines = getLines(filename);

        for(String line : lines) {
            allWordsWithoutDuplicates.addAll(lineToWords(line));
        }

        return allWordsWithoutDuplicates.tailSet(word, false).first();
    }
}
