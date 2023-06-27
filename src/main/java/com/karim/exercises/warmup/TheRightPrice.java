package com.karim.exercises.warmup;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class TheRightPrice {
    public static void main(String[] args) {
        RandomGenerator generator = RandomGenerator.getDefault();
        int price = generator.nextInt(100);
        System.out.print("First price guess: ");
        Scanner firstScanner = new Scanner(System.in);
        System.out.print('\n');
        int firstPriceGuess = firstScanner.nextInt();

        System.out.print("Second price guess: ");
        Scanner secondScanner = new Scanner(System.in);
        System.out.print('\n');
        int secondPriceGuess = secondScanner.nextInt();

        if (Math.abs(price - firstPriceGuess) < Math.abs(price - secondPriceGuess)) {
            System.out.print("First one to guess wins! The price was ");
        } else if (Math.abs(price - firstPriceGuess) > Math.abs(price - secondPriceGuess)){
            System.out.print("Second one to guess wins! The price was ");
        } else {
            System.out.print("You both win! The price was ");
        }
        System.out.print(price);


    }
}
