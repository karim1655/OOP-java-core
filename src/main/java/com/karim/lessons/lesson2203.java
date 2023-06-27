package com.karim.lessons;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lesson2203 {
    /*
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList(); //così ho accesso a tutti i metodi di arraylist
        //List<String> l = new ArrayList();  //perdo l'accesso a tutti i metodi di arraylist, rimandendo solo con quelli di list. Il vantaggio è l'astrazione: se metto List a sinistra dell'=, a destra dell'uguale posso metterci qualsiasi tipo di lista più specifica: arraylist, linkedlist...

        l.add("nicola");    //29:35
        l.add("nicola1");
        l.add("nicola2");
        l.add("nicola3");

        l.remove("nicola3");

        System.out.println(l);
        System.out.println(l.contains("giulia"));

        //linkedist 36:00
    }
    */

    /*
    public static void main(String[] args) {
        Set<String> s = new HashSet();
        s.add("nicola");
        s.add("ciccio");
        s.add("abaco");
        s.add("abaco"); //nope, non si può


        System.out.println(s);
    }
    */

    public static void main(String[] args) {
        List<String> l = List.of("nicola", "carlo", "agata", "agata");
        List<String> l2 = new ArrayList<>(new HashSet(l));    //grazie al set, ottengo la lista di prima senza i duplicati


        Set<String> s = new HashSet<>(l2);  //57:00
        System.out.println(s.contains("agata"));
    }
}
