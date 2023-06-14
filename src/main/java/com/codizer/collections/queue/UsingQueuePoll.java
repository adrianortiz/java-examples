package com.codizer.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class UsingQueuePoll {

    public static void main(String[] args) {

        Queue<String> cola = new LinkedList<>();
        cola.offer("hola");
        cola.offer("que");
        cola.offer("tal");
        cola.offer("estas");
        cola.offer("tu");
        cola.offer("hoy");

        System.out.println(cola.poll());
        System.out.println(cola.poll());
        System.out.println(cola.poll());
        System.out.println(cola.poll());
        System.out.println(cola.poll());
        System.out.println(cola.poll());
        System.out.println(cola.poll()); // Cola vacia

    }
}
