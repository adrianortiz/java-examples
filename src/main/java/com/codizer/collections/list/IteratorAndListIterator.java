package com.codizer.collections.list;

import com.codizer.collections.set.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorAndListIterator {

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

        // Iterator<Person> it = lista.iterator();
        ListIterator<Person> it = lista.listIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("******************************");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }


    }
}
