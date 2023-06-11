package com.codizer.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main01 {

    public static void main(String[] args) {

        Collection<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");

        List<String> lista1 = new ArrayList<>();
        lista1.add("hola");
        lista1.add("que");
        lista1.add("tal");
        lista1.add("estas");

        Iterable<String> iterable = lista;
        Iterator<String> it = iterable.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("******************");
        for (String cadena: lista) {
            System.out.println(cadena);
        }

    }
}
