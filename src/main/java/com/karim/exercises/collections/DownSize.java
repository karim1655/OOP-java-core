package com.karim.exercises.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DownSize {
    public static void downsize(List<String> list, int n) {
        int count = 1;

        for(Iterator<String> iterator = list.iterator(); iterator.hasNext();count++) {
            iterator.next();
            if(count % n == 0) {
                iterator.remove();
            }
        }
    }

}
