package com.karim.exercises.functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Words {
    /**
     * For reading the file and transforming it into a List<String>.
     * @return A List<String> in which each string is a line of the file.
     */
    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    /**
     * For splitting a line into a list of single words
     */
    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }

    public static long howManyLines(String filename, String subString) throws IOException {
        List<String> book = getLines(filename);
        return book.stream()
                .filter(line -> line.contains(subString))
                .count();
    }
    public static long howManyTimes(String filename, String word) throws IOException {
        List<String> book = getLines(filename);
        return book.stream()
                .flatMap(line -> lineToWords(line).stream())
                .filter(currentWord -> currentWord.equals(word))
                .count();
        //return book.stream().flatMap(line -> Arrays.stream(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"))).filter(w -> w.equals(word)).count();
    }
}
