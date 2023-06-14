package com.codizer.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAll {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");
        lista.add("tu");
        lista.add("hoy");

        lista.replaceAll((s) -> s.toUpperCase());
        lista.replaceAll(String::toUpperCase);

        for (String texto : lista) {
            System.out.println(texto);
        }
    }
}
