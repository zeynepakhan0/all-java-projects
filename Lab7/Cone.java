package Lab7;

public class Cone extends Shape3D{
    double r;
    double h;

    public Cone(double r, double h) {
        super("Cone");
        this.r = r;
        this.h = h;
    }


    @Override
    public double calculateArea() {
        return Math.PI*r*Math.sqrt(r*r+h*h);
    }

    @Override
    public double calculateVolume() {
        return Math.PI*r*r*h/3;
    }
}
