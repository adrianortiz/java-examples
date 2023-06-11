package com.codizer.examples;

import java.util.ArrayList;
import java.util.LinkedList;

public class LikedListVsArrayList {

    public static void main(String[] args) {
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("Adrian");
        namesLinkedList.add("Karen");
        namesLinkedList.add("Omar");
        namesLinkedList.add("Diana");
        System.out.println(namesLinkedList.get(2));
        namesLinkedList.add(1, "Jerry");

        String[] names = new String[4];

        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("Adrian");
        namesArrayList.add("Karen");
        namesArrayList.add("Omar");
        namesArrayList.add("Diana");
        System.out.println(namesArrayList.get(2));
        namesArrayList.add(1, "Jerry");
    }
}
