package com.codizer.collections.collection;

import java.util.ArrayList;
import java.util.Collection;

public class AddAll {

    public static void main(String[] args) {

        Collection<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");

        Collection<String> lista2 = new ArrayList<>();
        lista2.add("nuevo");
        lista2.add("nuevo2");
        lista2.add("nuevo3");

        lista.addAll(lista2);

        for (String text: lista) {
            System.out.println(text);
        }

    }
}