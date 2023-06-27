package com.karim.exercises.warmup;

import java.util.Scanner;

/**
 * Tells if we are in trouble, that is either if both monkeys are smiling or if both aren't.
 * @author Karim
 * @version 2023.03.07
 */
public class MonkeyTrouble {
    public static void main(String[] args) {
        System.out.println("Is monkey a smiling? (1 = yes, 0 = no)");
        Scanner a = new Scanner(System.in);
        int aMonkeySmile = a.nextInt();
        System.out.println("Is monkey b smiling? (1 = yes, 0 = no)");
        Scanner b = new Scanner(System.in);
        int bMonkeySmile = b.nextInt();

        if(aMonkeySmile == bMonkeySmile){
            System.out.println("Oh oh, you're in trouble :(");
        } else{
            System.out.println("Phew! You're fine");
        }
    }
}
