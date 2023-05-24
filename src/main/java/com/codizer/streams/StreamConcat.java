package com.codizer.streams;

import java.util.stream.Stream;

public class StreamConcat {

    public static void main(String[] args) {

        Stream<Integer> a = Stream.of(1, 2, 3);
        Stream<Integer> b = Stream.of(3, 4, 5);

        Stream<Integer> r = Stream.concat(a, b);

        System.out.println("r: ");
        r.forEach(x -> System.out.print(x + ""));

    }
}
