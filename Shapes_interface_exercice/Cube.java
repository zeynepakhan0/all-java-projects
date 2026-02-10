package Lab7;

public class Cube extends Shape3D{
    double e;

    public Cube(double e) {
        super("Cube");
        this.e = e;
    }

    @Override
    public double calculateArea() {
        return 6*e*e;
    }

    @Override
    public double calculateVolume() {
        return e*e*e;
    }
}
