package com.codizer.collections.map.hashmap;

import java.util.HashMap;
import java.util.Set;

public class UsingKeySet {

    public static void main(String[] args) {

        HashMap<String, Person> mapa = new HashMap<>();
        mapa.put("9", new Person("9", "pepe", 20, 1));
        mapa.put("2", new Person("2", "pepe", 20, 2));
        mapa.put("3", new Person("3", "pepe", 20, 3));
        mapa.put("7", new Person("7", "pepe", 20, 4));

        Set<String> conjuntoClaves = mapa.keySet();

        for (String clave : conjuntoClaves) {
            System.out.println(clave);
            System.out.println(mapa.get(clave));
        }

    }
}
