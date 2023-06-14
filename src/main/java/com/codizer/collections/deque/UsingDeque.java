package com.codizer.collections.deque;

import java.util.Deque;
import java.util.LinkedList;

public class UsingDeque {

    public static void main(String[] args) {

        Deque<Person> pila = new LinkedList<>();
        pila.offerFirst(new Person("1", "pedro", 20, 1));
        pila.offerFirst(new Person("2", "juan", 20, 1));
        pila.offerFirst(new Person("3", "ana", 30, 2));
        pila.offerFirst(new Person("4", "maria", 40, 5));
        pila.offerFirst(new Person("5", "gema", 50, 3));

        System.out.println(pila.pollFirst());
        System.out.println(pila.pollFirst());
        System.out.println(pila.pollFirst());
        System.out.println(pila.pollFirst());
        System.out.println(pila.pollFirst());
        System.out.println(pila.pollFirst());

    }
}
