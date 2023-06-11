package com.codizer.examples.equals;

public class EqualsTutorial {

    public static void main(String[] args) {

        int int1 = 4;
        int int2 = 4;

        if (int1 == int2) {
            System.out.println("The numbers are equal");
        } else {
            System.out.println("The numbers are not equal");
        }

        newLine();
        String string1 = new String("Hello");
        String string2 = new String("Hello");

        if (string1 == string2) {
            System.out.println("The String are equal");
        } else {
            System.out.println("The String are not equal");
        }

        if (string1.equals(string2)) {
            System.out.println("The String are equal");
        } else {
            System.out.println("The String are not equal");
        }

        newLine();
        Dog myDog = new Dog();
        Dog yourDog = new Dog();

        if (myDog.equals(yourDog)) {
            System.out.println("The dogs are equal");
        } else {
            System.out.println("The dogs are not equal");
        }

        newLine();
        String string3 = "Hello";
        String string4 = "Hello";

        if (string3 == string4) {
            System.out.println("The String are equal");
        } else {
            System.out.println("The String are not equal");
        }

    }

    private static void newLine() {
        System.out.println("------------------------------------------");
    }
}
