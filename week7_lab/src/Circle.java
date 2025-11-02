public class Circle extends Shape2D{
    private double radius;
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    @Override
    public double calculatePerimeter(){
        return 2*Math.PI * radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }

}
