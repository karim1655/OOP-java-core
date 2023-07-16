package com.karim.exercises.generics;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static <T> T max(List<T> list, Comparator<? super T> cmp) {
        return Collections.max(list, cmp);
    }
    public static <T> T min(List<T> list, Comparator<? super T> cmp) {
        return Collections.min(list, cmp);
    }
}
