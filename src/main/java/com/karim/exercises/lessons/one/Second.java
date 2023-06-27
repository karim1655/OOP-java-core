package com.karim.exercises.lessons.one;

import java.awt.*;
import java.util.Arrays;

public class Second {
    public static final int MAX_SIZE = 10;
    public static void main(String[] args) {
        int[] v = new int[10];
        int[] v2 = {1, 2, 3, 4, 5};

        String[] w;     //sto solo dichiarando il riferimento, prima o poi devo per forza creare l'oggetto vero e proprio: w = new String[];
        double d;

        char[] c;
        Point[] p;


        w = new String[11];
        w[1] = new String();

        Arrays.fill(w, "nicola");
        for (String n : w) {
            System.out.println(n);

        }

    }
}
