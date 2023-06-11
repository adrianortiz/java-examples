package com.codizer.collections.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Equals {

    public static void main(String[] args) {

        Collection<Person> lista = new ArrayList<>();
        lista.add(new Person("1", "Fernando", 20));
        lista.add(new Person("2", "Juan", 30 ));
        lista.add(new Person("3", "Karen", 24));
        lista.add(new Person("4", "Diana", 26));

        lista.remove(new Person("1"));

        for (Person p: lista) {
            System.out.println(p);
        }
    }
}
