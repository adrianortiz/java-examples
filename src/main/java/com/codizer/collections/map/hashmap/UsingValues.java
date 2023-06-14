package com.codizer.collections.map.hashmap;

import java.util.Collection;
import java.util.HashMap;

public class UsingValues {

    public static void main(String[] args) {

        HashMap<String, Person> mapa = new HashMap<>();
        mapa.put("9", new Person("9", "pepe", 20, 1));
        mapa.put("2", new Person("2", "juan", 21, 2));
        mapa.put("3", new Person("3", "miguel", 22, 3));
        mapa.put("7", new Person("7", "antonio", 24, 4));

        Collection<Person> collection = mapa.values();

        for (Person p: collection) {
            System.out.println(p.getDni());
            System.out.println(p.getName());
        }

    }
}
