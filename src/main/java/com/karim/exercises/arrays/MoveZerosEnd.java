package com.karim.exercises.arrays;

import java.util.Arrays;

public class MoveZerosEnd {
    public static int[] moveZerosEnd(int[] v){
        int[] dest = new int[v.length];
        int destIndex = 0;
        for(int elem : v) {
            if(elem != 0){
                dest[destIndex] = elem;
                destIndex++;
            }
        }
        if(destIndex < v.length - 1) {
            Arrays.fill(dest, destIndex, v.length - 1, 0);
        }
        return dest;
    }
}
