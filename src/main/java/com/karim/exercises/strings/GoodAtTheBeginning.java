package com.karim.exercises.strings;

public class GoodAtTheBeginning {
    public static boolean goodAtTheBeginning(String string) {
        if(string.length() < 4) {
            return false;
        }

        return string.substring(0, 4).equals("good");
        // oppure equivalentemente
        //  return string.startsWith("good");

    }
}
