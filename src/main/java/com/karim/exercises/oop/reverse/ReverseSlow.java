package com.karim.exercises.oop.reverse;

public class ReverseSlow implements Reverser{

    @Override
    public String reverse(String s) {
        char[] reversed = new char[s.length()];

        for(int i = 0; i < s.length(); i++) {
            reversed[i]= s.charAt(s.length() - i -1);
        }

        return reversed.toString();
    }
}
