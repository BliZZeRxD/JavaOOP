package com.company;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    @Override
    public boolean equals(Object e) {
        Person p = (Person) e;
        if (this.name.equals(p.name))
            return true;
        else
            return false;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name: " + name;
    }

}
