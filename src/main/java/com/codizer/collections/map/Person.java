package com.codizer.collections.map;

public class Person {

    private String dni;
    private String name;
    private int age;
    private int seriousness;

    public Person() {
    }

    public Person(String dni) {
        this.dni = dni;
    }

    public Person(String dni, String name, int age, int seriousness) {
        this.dni = dni;
        this.name = name;
        this.age = age;
        this.seriousness = seriousness;
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

    public int getSeriousness() {
        return seriousness;
    }

    public void setSeriousness(int seriousness) {
        this.seriousness = seriousness;
    }

    @Override
    public String toString() {
        return "Person{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", seriousness=" + seriousness +
                '}';
    }
}
