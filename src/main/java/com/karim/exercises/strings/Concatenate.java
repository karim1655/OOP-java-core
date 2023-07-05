package com.karim.exercises.strings;

public class Concatenate {
    public static String concatenate(String[] strings) {
        StringBuilder dst = new StringBuilder();
        for(String string : strings) {
            dst.append(string);
        }

        return dst.toString();       //dato che devo ritornare una stringa, ma ho uno stringbuilder, casto lo stringbuilder a una stringa con toString()
    }
}
