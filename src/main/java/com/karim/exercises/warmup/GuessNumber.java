package com.karim.exercises.warmup;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class GuessNumber {
    public static void main(String[] args) {
        RandomGenerator generator = RandomGenerator.getDefault();

        for(;;) {
            int randomNumber = generator.nextInt(4);
            System.out.println("Guess the number from 0 to 3");
            Scanner scanner = new Scanner(System.in);
            int guess = scanner.nextInt();
            if(randomNumber == 0 && randomNumber == guess) {
                System.out.println("Correct guess!");
                break;
            }

        }
    }
}
//bruh