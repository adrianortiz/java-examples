package com.codizer.collections.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Add {

    public static void main(String[] args) {

        Collection<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");

        for (String texto: lista) {
            System.out.println(texto);
        }
    }
}
