package Week_8_A;

import java.util.*;

public class Test {

    public static void main(String[] args){

        Cylinder c = new Cylinder(14, 12);

        System.out.println("Cylinder Volume: " + c.volume());
        System.out.println("Cylinder SuArea: " + c.surfaceArea());

        Sphere s = new Sphere(14);

        System.out.println("Sphere   Volume: " + s.volume());
        System.out.println("Sphere   SuArea: " + s.surfaceArea());

        Cube cub = new Cube(5);

        System.out.println("Cube     Volume: " + cub.volume());
        System.out.println("Cube     SuArea: " + cub.surfaceArea());

    }

}
