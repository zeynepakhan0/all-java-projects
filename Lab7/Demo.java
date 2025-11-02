package Lab7;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Shape2D> shape2DS = new ArrayList<>();
        ArrayList<Shape3D> shape3DS = new ArrayList<>();

        Circle circle = new Circle(3.5);
        Square square = new Square(4);
        Cube cube = new Cube(7);
        Cone cone = new Cone(3,4);

        shape2DS.add(circle);
        shape2DS.add(square);
        shape3DS.add(cube);
        shape3DS.add(cone);

        for (int i = 0; i < shape2DS.size(); i++) {
            Shape2D shape2D = shape2DS.get(i);
            System.out.println(shape2D);
        }

        for(Shape3D shape3D:shape3DS){
            System.out.println(shape3D);
        }
    }
}
