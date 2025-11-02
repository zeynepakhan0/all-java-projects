package Lab7;

public abstract class Shape3D extends Shape implements AreaCalculation,VolumeCalculation{
    public Shape3D(String name) {
        super(name);
    }

    public String toString(){
        return super.toString() + " Area:" + calculateArea() + " Volume:" + calculateVolume();
    }
}
