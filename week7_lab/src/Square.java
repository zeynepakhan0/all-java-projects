public class Square extends Shape2D{
    private double side;
    public Square(double side){
        super();
        this.side = side;
    }
    public double calculatePerimeter(){
        return 4*side;
    }
    public double calculateArea(){
        return side*side;
    }
}
