package Lab7;

public abstract class Shape2D extends Shape implements PerimeterCalculation,AreaCalculation{
    public Shape2D(String name) {
        super(name);
    }

    public String toString(){
        return super.toString() + " Perimeter:" + calculatePerimeter() + " Area:" + calculateArea();
    }

}
