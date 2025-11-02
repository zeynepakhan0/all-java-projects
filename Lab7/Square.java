package Lab7;

public class Square extends Shape2D{
    double e;

    public Square(double e) {
        super("Square");
        this.e = e;
    }

    @Override
    public double calculateArea() {
        return e*e;
    }

    @Override
    public double calculatePerimeter() {
        return 4*e;
    }
}
