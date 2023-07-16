package com.karim.exercises.strings;

public class EqualIsNot {
    public static boolean equalIsNot(String string) {

        if(!string.contains("is") && !string.contains("not")) {
            return false;
        }

        String tmp = string;
        int lastIsIndex;
        int isCount = 0;
        int lastNotIndex;
        int notCount = 0;

        while(tmp.length() >= 2 && tmp.contains("is")) {
            if((lastIsIndex = tmp.indexOf("is")) > 0) {
                isCount++;
                tmp = tmp.substring(lastIsIndex + 1);
            }
        }
        tmp = string;
        while(tmp.length() >= 3 && tmp.contains("not")) {
            if((lastNotIndex = tmp.indexOf("not")) > 0) {
                notCount++;
                tmp = tmp.substring(lastNotIndex + 2);
            }
        }

        return isCount == notCount;
    }
}
