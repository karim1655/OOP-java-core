package com.karim.exercises.collections;

import java.util.*;

public class ValuesKeys {
    public static boolean valuesKeys(Map<String, String> map) {
        Set<String> keys = map.keySet();
        List<String> values = new ArrayList<>(map.values());

        for(String key : keys) {
            if (values.contains(key)) {
                return true;
            }
        }
        return false;

        // Oppure come i pro
        /*
        Set<String> intersection = new HashSet<>(map.keySet());
        intersection.retainAll(new HashSet<>(map.values()));
        return !intersection.isEmpty();
         */
    }
}
