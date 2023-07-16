package com.karim.exercises.arrays;

import java.util.Arrays;

public class DeepCopy {
    public static int[][] deepCopy(int[][] original) {
        //nuovo array di array
        int[][] copy = new int[original.length][];

        for (int i = 0; i < original.length; i++) {
            //nell'i-esima posizione copio l'i-esimo array con la sua lunghezza
            //Arrays.copyof() si prende cura dell'allocazione dello spazio per la copia degli array del secondo strato
            copy[i] = Arrays.copyOf(original[i], original[i].length);
        }

        return copy;
    }
}
