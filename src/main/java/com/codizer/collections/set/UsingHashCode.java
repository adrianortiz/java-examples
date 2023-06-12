package com.codizer.collections.set;

import java.util.HashSet;
import java.util.Set;

public class UsingHashCode {

    public static void main(String[] args) {

        Set<String> lista = new HashSet<>();
        lista.add("hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");
        lista.add("estoy");
        lista.add("muy");
        lista.add("bien");
        lista.add("mejor");
        lista.add("de");
        lista.add("lo");
        lista.add("que");
        lista.add("pensaba");
        lista.add("estar");

        for (String texto : lista) {
            System.out.println(texto.hashCode());
        }

        System.out.println("termina");
    }
}
