package Week_8_A;

public class Sphere extends AbstractShapes implements Shapes{

    public double r;

    public Sphere(double r){

        this.r = r;

    }

    public double volume(){
        return (Math.PI * (this.r * this.r * this.r) * 4) / 3;
    }

    public double surfaceArea(){
        return Math.PI * (this.r * this.r) * 4;
    }

}
