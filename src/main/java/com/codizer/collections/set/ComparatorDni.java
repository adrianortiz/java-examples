package com.codizer.collections.set;

import java.util.Comparator;

public class ComparatorDni implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getDni().compareTo(o2.getDni());
    }
}
