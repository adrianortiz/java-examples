package com.codizer.collections.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Remove {

    public static void main(String[] args) {

        Collection<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("hola");
        lista.add("que");
        lista.add("tal");

        lista.remove("hola");

        for (String text: lista) {
            System.out.println(text);
        }

    }
}
