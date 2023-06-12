package com.codizer.collections.set;

import java.util.Objects;

public class Person implements Comparable {

    private String dni;
    private String name;
    private int age;

    public Person(String dni) {
        this.dni = dni;
    }

    public Person(String dni, String name, int age) {
        this.dni = dni;
        this.name = name;
        this.age = age;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(dni, person.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public int compareTo(Object o) {
         // ordernar personas
        Person p = (Person) o;
        if (this.getAge() > p.getAge()) {
            return 1;
        } else if (this.getAge() == p.getAge()){
            return 0;
        } else {
            return -1;
        }

    }
}
