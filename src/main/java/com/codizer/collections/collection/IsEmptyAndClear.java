package com.codizer.collections.collection;

import java.util.ArrayList;
import java.util.Collection;

public class IsEmptyAndClear {

    public static void main(String[] args) {
        Collection<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("que");
        lista.add("tal");
        lista.add("hola");
        lista.add("que");
        lista.add("tal");

        System.out.println(lista.size());
        System.out.println(lista.isEmpty());
        lista.clear();
        System.out.println(lista.isEmpty());
    }
}
