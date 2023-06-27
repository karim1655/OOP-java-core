package com.karim.exercises.oop.reverse;

public class ReverseFast implements Reverser{

    /**
     * Uso lo StringBuilder, che è un "tipo" di stringa che ha  già il metodo reverse integrato
     * @param s the string to be reversed
     * @return
     */
    @Override
    public String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
