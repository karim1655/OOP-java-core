package com.karim.exercises.strings;

public class GoodAroundTheBeginning {
    public static boolean goodAroundTheBeginning(String string) {
        if(string.length() == 4) {
            return string.startsWith("good");
        }
        else if (string.length() > 4) {
            return string.startsWith("good") || string.startsWith("good", 1);
        }

        return false;
    }
}
