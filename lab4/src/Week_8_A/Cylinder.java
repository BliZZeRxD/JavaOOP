package Week_8_A;

public class Cylinder extends AbstractShapes implements Shapes {

    public double r;
    public double h;

    public Cylinder(double r, double h){
        this.r = r;
        this.h = h;
    }

    public double surfaceArea(){
        return this.r * this.r * Math.PI;
    }

    public double volume(){
        return surfaceArea() * this.h;
    }

}
