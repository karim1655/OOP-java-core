package com.karim.exercises.collections;

import java.util.Iterator;
import java.util.List;

public class SpeedTest {
    public static long insertBeginning(List<String> list, String item, int times) {
        long beginning = System.nanoTime();
        for(int i = 0; i < times; i++) {
            list.add(0, item);
        }
        return System.nanoTime() - beginning;
    }
    public static long insertEnd(List<String> list, String item, int times) {
        long beginning = System.nanoTime();
        for(int i = 0; i < times; i++) {
            list.add(item);
        }
        return System.nanoTime() - beginning;
    }
}
