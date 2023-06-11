package com.codizer.collections.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class RemoveAll {

    public static void main(String[] args) {

        Collection<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");

        lista.removeAll(Arrays.asList("que", "tal"));
        lista.removeAll(List.of("estas")); // Java => 9

        for (String texto: lista) {
            System.out.println(texto);
        }

    }
}
