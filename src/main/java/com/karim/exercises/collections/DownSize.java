package com.karim.exercises.collections;

import java.util.List;
import java.util.ListIterator;

public class DownSize {
    public static void downsize(List<String> list, int n) {
        int count = 1;
        for(ListIterator<String> i = list.listIterator(); i.hasNext();count++) {
            i.next();
            if(count % n == 0) {
                i.remove();
            }
        }
    }

}
