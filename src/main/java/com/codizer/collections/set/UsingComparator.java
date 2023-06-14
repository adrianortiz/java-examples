package com.codizer.collections.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class UsingComparator {

    public static void main(String[] args) {

        ComparatorDni comparatorDni = new ComparatorDni();
        ComparatorName comparatorName = new ComparatorName();

        Comparator<Person> multiple = comparatorDni.thenComparing(comparatorName);

        Set<Person> conjunto = new TreeSet<>(multiple);
        conjunto.add(new Person("1", "pepe", 20));
        conjunto.add(new Person("2", "juan", 2));
        conjunto.add(new Person("2", "pedro", 2));
        conjunto.add(new Person("2", "maria", 2));
        conjunto.add(new Person("2", "juan", 2));
        conjunto.add(new Person("3", "ana", 30));
        conjunto.add(new Person("4", "miguel", 10));

        for (Person p: conjunto) {
            System.out.println(p.getDni() + " " + p.getName());
        }

    }
}
