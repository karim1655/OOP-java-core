package com.karim.exercises.collections;

import java.util.HashMap;
import java.util.Map;

public class MorseCode {
    public static HashMap<Character, String> conversionMap() {
        HashMap<Character, String> conversionMap = new HashMap<>();
        conversionMap.put('a', "._");
        conversionMap.put('b', "_...");
        conversionMap.put('c', "_._.");
        conversionMap.put('d', "_..");
        conversionMap.put('e', ".");
        conversionMap.put('f', ".._.");
        conversionMap.put('g', "__.");
        conversionMap.put('h', "....");
        conversionMap.put('i', "..");
        conversionMap.put('j', ".___");
        conversionMap.put('k', "_._");
        conversionMap.put('l', "._..");
        conversionMap.put('m', "__");
        conversionMap.put('n', "_.");
        conversionMap.put('o', "___");
        conversionMap.put('p', ".__.");
        conversionMap.put('q', "__._");
        conversionMap.put('r', "._.");
        conversionMap.put('s', "...");
        conversionMap.put('t', "_");
        conversionMap.put('u', ".._");
        conversionMap.put('v', "..._");
        conversionMap.put('w', ".__");
        conversionMap.put('x', "_.._");
        conversionMap.put('y', "_.__");
        conversionMap.put('z', "__..");
        return conversionMap;
    }

    public static String morseCode(String string) {
        if(string.length() == 0) {
            return "";
        }

        Map<Character, String> morseCodeMap = conversionMap();
        StringBuilder conversion = new StringBuilder();

        for(Character c : string.toLowerCase().toCharArray()) {
            if(morseCodeMap.containsKey(c)) {
                conversion.append(morseCodeMap.get(c)).append(" ");
            }
            else {
                throw new IllegalArgumentException();
            }
        }

        return conversion.substring(0, conversion.length() - 1);
    }
}
