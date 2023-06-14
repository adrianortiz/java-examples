package com.codizer.collections.queue.priorityqueue;

import java.util.Comparator;

public class ComparatorSeriousnessPerson implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {

        if (o1.getSeriousness() > o2.getSeriousness()) {
            return -1;
        } else if (o1.getSeriousness() == o2.getSeriousness()) {
            return 0;
        } else {
            return 1;
        }

    }
}
