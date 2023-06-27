package com.karim.exercises.generics;

import java.util.List;


/*
Con il comando addAll appendo tutta una lista ad un'altra.
Senza, si dovrebbe usare un iterator per ciclare dst e appenderla man mano a src. Provalo.
 */
public class Append {
    public static <T> void append(List<T> dst, List<T> src) {
        src.addAll(dst);
    }
}
