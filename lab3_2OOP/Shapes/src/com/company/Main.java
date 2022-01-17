package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Shapes cube = new Cube(4.0D);
        System.out.println(cube.surfaceArea());
        Shapes cylinder = new Cylinder(2.0D, 4.0D);
        System.out.println(cylinder.surfaceArea());
        System.out.println(cylinder.volume());
    }
}
