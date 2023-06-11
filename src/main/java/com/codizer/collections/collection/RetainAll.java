package com.codizer.collections.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RetainAll {

    public static void main(String[] args) {

        Collection<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("que");
        lista.add("tal");
        lista.add("hola");
        lista.add("que");
        lista.add("tal");

        lista.retainAll(List.of("hola", "que"));

        for (String text: lista) {
            System.out.println(text);
        }

    }
}
