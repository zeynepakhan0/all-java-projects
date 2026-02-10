import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
        ArrayList<Shape2D> shapes2D=new ArrayList<Shape2D>();
        ArrayList<Shape3D> shapes3D=new ArrayList<>();
        public Demo(){
            Shape2D circle = new Circle(5);
            Shape2D square = new Square(4);
            Shape3D cone = new Cone(3, 7);
            Shape3D cube = new Cube(2);
            shapes2D.add(circle);
            shapes2D.add(square);
            shapes3D.add(cone);
            shapes3D.add(cube);
            Iterator<Shape2D> iterator=shapes2D.iterator();
            while(iterator.hasNext()){
                Shape2D shape2D=iterator.next();
                System.out.println(shape2D.calculateArea());
                System.out.println(shape2D.calculatePerimeter());
            }
            Iterator<Shape3D> iterator3D=shapes3D.iterator();
            while(iterator3D.hasNext()){
                Shape3D shape3D=iterator3D.next();
                System.out.println(shape3D.calculateArea());
                System.out.println(shape3D.calculateVolume());
            }
        }









}
