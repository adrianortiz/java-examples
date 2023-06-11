package com.codizer.examples.order;

import java.util.Arrays;
import java.util.Collections;

public class OrderArray {

    public static void main(String[] args) {
        orderAsc();
        orderDes();
    }

    private static void orderAsc() {
        Integer[] numbers = {10, 5, 6, 1, 3, 2, 9};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void orderDes() {
        Integer[] numbers = {10, 5, 6, 1, 3, 2, 9};
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
