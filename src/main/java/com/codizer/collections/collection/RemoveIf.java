package com.codizer.collections.collection;

import java.util.ArrayList;
import java.util.Collection;

public class RemoveIf {

    public static void main(String[] args) {

        Collection<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("que");
        lista.add("tal");
        lista.add("hola");
        lista.add("que");
        lista.add("tal");

        // Using predicate, one parameter, return boolean
        lista.removeIf((t)->t.equals("hola"));
        lista.stream().forEach(System.out::println);

    }
}
