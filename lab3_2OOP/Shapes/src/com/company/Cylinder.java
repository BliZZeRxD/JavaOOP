package com.company;

public class Cylinder extends Shapes {
    private double radius;
    private double height;
    final double pi = 3.141592653589793D;

    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double surfaceArea() {
        return 6.283185307179586D * Math.pow(this.radius, 2.0D) + 6.283185307179586D * this.radius * this.height;
    }

    public double volume() {
        return 3.141592653589793D * Math.pow(this.radius, 2.0D) * this.height;
    }

    public double Diagonal() {
        return 0.0D;
    }
}
