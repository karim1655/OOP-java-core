package com.karim.exercises.generics;

import java.util.Iterator;

/*
Uso lo stringbuilder sempre per il fatto che le stringhe non si possono modificare, quindi butta sempre via quella vecchia
e la rimpiazza con quella nuova, il che è sprecone, quindi usiamo uno stringbuilder che è più intelligente

Nel for scorro src con l'iterator iterator.
Dentro il for appendo la roba alla stringa

il return preciso dovrebbe essere return dst.substring(0, dst.length() - 2); così toglie il virgola spazio che viene appeso alla fine
per niente.

 */
public class IterableToString {
    public static <E> String iterableToString(Iterable<E> src) {
        StringBuilder dst = new StringBuilder();
        for(E iterator : src) {
            dst.append(iterator).append(", ");
        }
        return dst.toString();
    }
}
