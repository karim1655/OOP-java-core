package com.karim.lessons;

import java.util.*;
/**
public class lesson2303 {
    /**
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();  //il <> si riempe solo dal lato sinistro dell'=
        l.add("nicola");
        l.add("karim");
        l.add(0, "franco");
        System.out.println(l.contains("bruh"));
        System.out.println(l.contains("franco"));
        System.out.println(l);
    }
     */

    /**
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();  //il <> si riempe solo dal lato sinistro dell'=
        l.add("nicola");
        l.add("karim");
        l.add("abaco");
        l.add(0, "franco");
        List<String> l2 = new ArrayList<>();
        l2.add("Giulia");
        l2.add("Ciccio");
        l.addAll(l2);
        l.addAll(List.of("Giulia", "Ciccio"));
        l.clear();  //svuota la lista
        //l = new ArrayList<>();  //altro metodo per svuotare una lista, un po' più brutto, 1:46:00 registrazione

        Collections.sort((l));
        Collections.binarySearch(l, "karim");
        System.out.println(l);
        System.out.println(l.contains("franco"));

    }
     */

    /**
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "nicola");
        map.put(2, "agata");
        map.put(3, "darma");
        map.put(4, "marzia");

        System.out.println(map.keySet());
        System.out.println(map.values());

        Set<Map.Entry<Integer, String>> l = map.entrySet();     //2:03:45, le entry sono le coppie inserite

        for (Map.Entry<Integer, String> entry : l) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
    */

    /**
    public static void main(String[] args) {
        List<PPerson> l = new ArrayList<>();
        l.add(new PPerson("pinco", "pallino"));

    }
}
    */