public class Cone extends Shape3D{
    private double radius;
    private double height;
    public Cone(double radius, double height){
        super();
        this.radius = radius;
        this.height = height;
    }
    public double calculateArea(){
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }
    public double calculateVolume() {
        return (1.0/3.0)*Math.PI*radius*radius*height;
    }
}
