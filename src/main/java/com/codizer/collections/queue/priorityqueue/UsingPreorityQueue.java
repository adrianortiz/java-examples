package com.codizer.collections.queue.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class UsingPreorityQueue {

    public static void main(String[] args) {

        Queue<Person> cola = new PriorityQueue<>(new ComparatorSeriousnessPerson());
        cola.offer(new Person("1", "pedro", 20, 1));
        cola.offer(new Person("2", "juan", 20, 1));
        cola.offer(new Person("3", "ana", 30, 2));
        cola.offer(new Person("4", "maria", 40, 5));
        cola.offer(new Person("5", "gema", 50, 3));

        System.out.println(cola.poll());
        System.out.println(cola.poll());
        System.out.println(cola.poll());
        System.out.println(cola.poll());
        System.out.println(cola.poll());
        System.out.println(cola.poll());


    }
}
