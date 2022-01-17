package com.company;

public class Cube extends Shapes {
    private double length;

    public Cube() {
    }

    public Cube(double length) {
        this.length = length;
    }

    public double surfaceArea() {
        return 6.0D * Math.pow(this.length, 2.0D);
    }

    public double Diagonal() {
        return this.length * Math.sqrt(3.0D);
    }

    public double volume() {
        return Math.pow(this.length, 3.0D);
    }
}
