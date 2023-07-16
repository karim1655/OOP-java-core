package com.karim.exercises.functional;

import java.util.List;
import java.util.Map;

public class JustPrint {
    public static <T> void justPrintList(List<T> list) {
        list.forEach((el) -> System.out.println("Hello " + el + "!"));
    }
    public static <K,V> void justPrintMap(Map<K, V> map) {
        map.forEach((key, value) -> System.out.println("k:" + key + ", v:" + value));
    }
}
