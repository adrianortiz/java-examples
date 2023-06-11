package com.codizer.collections.introduction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class Main03 {

    public static void main(String[] args) {

        Collection<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");

        Stream<String> flujo = lista.stream();
        // Expresion Lamda
        flujo.forEach((e)->System.out.println(e));

        System.out.println("********************");
        // Metodo de referencia
        flujo = lista.stream();
        flujo.forEach(System.out::println);

    }
}
