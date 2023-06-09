package com.codizer.examples;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class OrderArray {

    public static void main(String[] args) {
        orderAsc();
        orderDes();
    }

    private static void orderAsc() {
        Integer[] numbers = {10, 5, 7, 6, 9, 2, 1};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void orderDes() {
        Integer[] numbers = {10, 5, 7, 6, 9, 2, 1};
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println(Arrays.toString(numbers));
    }
}
