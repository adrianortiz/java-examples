package com.codizer.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class UsingQueueOffer {

    public static void main(String[] args) {

        Queue<String> cola = new LinkedList<>();
        cola.offer("hola");
        cola.offer("que");
        cola.offer("tal");

        System.out.println(cola.peek());
        System.out.println(cola.poll());

    }
}
