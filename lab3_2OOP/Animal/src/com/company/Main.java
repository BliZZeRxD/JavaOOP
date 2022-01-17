package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog(false, "Hatiko", 4);

        System.out.println("Does the dog is wild? " + dog.isWild());
        System.out.println("What is it name? " + dog.getName());
        System.out.println("How many legs does it has?  " + dog.getLegs());
        System.out.println("What is the color?  " + dog.getColor());



    }
}

