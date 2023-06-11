package com.codizer.collections.introduction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main02 {

    public static void main(String[] args) {

        Collection<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");

        Iterator<String> it = lista.iterator();

        while (it.hasNext()) {
            String cadena = it.next();
            if (cadena.equals("hola")) {
                it.remove();
            }
            System.out.println(cadena);
        }

        System.out.println("*****************");
        Iterator<String> it2 = lista.iterator();

        while (it2.hasNext()) {
            System.out.println(it2.next());
        }


    }
}
