public class Cube extends Shape3D{
    private double side;
    public Cube(double side){
        super();
        this.side = side;
    }
    public double calculateArea(){
        return 6*side*side;
    }
    public double calculateVolume(){
        return side*side*side;
    }
}
