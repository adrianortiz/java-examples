package com.codizer.collections.list;

import com.codizer.collections.set.Person;

import java.util.ArrayList;
import java.util.List;

public class AccessByPosition {

    public static void main(String[] args) {
        List<Person> lista = new ArrayList<>();
        lista.add(new Person("1", "pep", 20));
        lista.add(new Person("2", "juan", 2));
        lista.add(new Person("3", "ana", 30));
        lista.add(new Person("4", "miguel", 10));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            System.out.println(i);
        }
    }
}
