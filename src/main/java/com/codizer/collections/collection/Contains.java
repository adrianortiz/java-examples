package com.codizer.collections.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Contains {

    public static void main(String[] args) {

        Collection<Person> lista = new ArrayList<>();
        lista.add(new Person("1", "Fernando", 20));
        lista.add(new Person("2", "Juan", 30 ));
        lista.add(new Person("3", "Karen", 24));
        lista.add(new Person("4", "Diana", 26));

        System.out.println(lista.contains(new Person("1")));
        System.out.println(lista.contains(new Person("5")));

        System.out.println(lista.containsAll(List.of(new Person("1"), new Person("2"))));


    }
}
