package com.codizer.collections.set;

import java.util.HashSet;
import java.util.Set;

public class Add {

    public static void main(String[] args) {

        Set<String> lista = new HashSet<>();
        lista.add("hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");
        lista.add("hoy");
        lista.add("hola");
        lista.add("que");

        for (String texto : lista) {
            System.out.println(texto);
        }
    }
}
