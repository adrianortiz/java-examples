package com.codizer.collections.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class UsingSortedSet {

    public static void main(String[] args) {
        SortedSet<Person> conjunto = new TreeSet<>(new ComparatorDni());
        conjunto.add(new Person("1", "pepe", 20));
        conjunto.add(new Person("2", "juan", 2));
        conjunto.add(new Person("3", "ana", 30));
        conjunto.add(new Person("4", "miguel", 10));

        System.out.println(conjunto.first());
        System.out.println(conjunto.last());

        for (Person p: conjunto.tailSet(new Person("3"))) {
            System.out.println(p.getName());
        }

        for (Person p: conjunto.headSet(new Person("3"))) {
            System.out.println(p.getName());
        }
    }
}
