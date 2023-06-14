package com.codizer.collections.list;

import com.codizer.collections.set.Person;

import java.util.Comparator;

public class ComparatorName implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
