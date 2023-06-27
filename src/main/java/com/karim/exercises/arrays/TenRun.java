package com.karim.exercises.arrays;

public class TenRun {
    public static int[] tenRun(int[] v){
        int currentMultiple;
        int i;
        for(i=0; i<v.length; i++) {
            if(v[i]%10 == 0) {
                break;
            }
        }
        currentMultiple = v[i];
        for(; i<v.length; i++) {
            if(v[i]%10 == 0) {
                currentMultiple = v[i];
            }
            else {
                v[i] = currentMultiple;
            }
        }

        return v;
    }
}
