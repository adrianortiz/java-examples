package com.codizer.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class UsingTreeSetAnComparable {

    public static void main(String[] args) {

        Set<Person> people = new TreeSet<>();
        people.add(new Person("1", "pepe", 20));
        people.add(new Person("2", "juan", 2));
        people.add(new Person("3", "ana", 30));
        people.add(new Person("4", "miguel", 10));

        // Order by Age
        for (Person person : people) {
            System.out.println(person.getName());
        }

        System.out.println("termina");
    }
}
