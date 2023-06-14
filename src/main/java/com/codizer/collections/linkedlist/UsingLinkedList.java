package com.codizer.collections.linkedlist;

import java.util.LinkedList;

public class UsingLinkedList {

    public static void main(String[] args) {

        LinkedList<String> lista = new LinkedList<>();
        lista.add("hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");
        lista.add("tu");
        lista.add("hoy");

        for (String texto : lista) {
            System.out.println(texto);
        }

    }
}
