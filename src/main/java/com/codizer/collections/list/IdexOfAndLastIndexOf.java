package com.codizer.collections.list;

import com.codizer.collections.set.Person;

import java.util.ArrayList;
import java.util.List;

public class IdexOfAndLastIndexOf {

    public static void main(String[] args) {
        List<Person> lista = new ArrayList<>();
        lista.add(new Person("1", "pepe", 20));
        lista.add(new Person("2", "juan", 2));
        lista.add(new Person("2", "pedro", 2));
        lista.add(new Person("2", "maria", 2));
        lista.add(new Person("2", "juan", 2));
        lista.add(new Person("3", "ana", 30));
        lista.add(new Person("1", "pepe", 20));
        lista.add(new Person("4", "miguel", 10));

        System.out.println(lista.indexOf(new Person("1", "pepe", 20)));
        System.out.println(lista.lastIndexOf(new Person("1", "pepe", 20)));

        System.out.println(lista.get(0));
        System.out.println(lista.get(6));

    }
}
