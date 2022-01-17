package Week_8_A;

public class Cube extends AbstractShapes implements Shapes {

    public double x;

    public Cube(double x){

        this.x = x;

    }

    public double volume(){
        return this.x * this.x * this.x;
    }

    public double surfaceArea(){
        return this.x * this.x * 6;
    }

}
