package com.karim.exercises.generics;

public class PairUtil {
    public static <K, V> Pair<V, K> swap(Pair<K, V> src) {
        Pair<V, K> dst = new Pair<>(src.second, src.first);
        return dst;
    }
}
