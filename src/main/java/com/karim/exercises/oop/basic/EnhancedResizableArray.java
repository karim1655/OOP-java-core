package com.karim.exercises.oop.basic;


public class EnhancedResizableArray {
    public static final int DEFAULT_CAPACITY = 4;
    int[] v;
    int size;

    /**
     * size = numero elementi che sono attualmente nell'array
     */
    public EnhancedResizableArray() {
        this.v = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void add(int value) {
        if(size >= v.length){
            int[] tmp = new int[v.length * 2];
            System.arraycopy(v, 0, tmp, 0, v.length);
            v = tmp;
        }
        v[size] = value;
        size++;
    }

    public void remove(int index) {
        int[] tmp = new int[v.length - 1];
        System.arraycopy(v, 0, tmp, 0, index);
        System.arraycopy(v, index + 1, tmp, index,v.length - index - 1);
        v = tmp;
        size--;
    }

    public int get(int index) {
        return v[index];
    }

    public void set(int index, int value) {
        v[index] = value;
    }

    public boolean contains(int value) {
        for (int j : v) {
            if (j == value) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] copy = new int[size];
        System.arraycopy(v, 0, copy, 0, size);
        return copy;
    }

}
