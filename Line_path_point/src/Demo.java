public class Demo {

    public static void main(String[] args) {
                Point2D p1 = new Point2D(1, 2);
                Point2D p2 = new Point2D(6, 5);
                Point2D p3 = new Point2D(7, 3);

                Path2D path = new Path2D();
                path.addPoint(p1);
                path.addPoint(p2);
                path.addPoint(p3);

                System.out.println("Path: " + path);
                System.out.println("Path Size: " + path.size());
                System.out.println("Path Length: " + path.length());

                Line2D line1 = new Line2D(2, 3);  // y = 2x + 3
                Line2D line2 = new Line2D(-1, 5); // y = -x + 5

                Point2D intersection = line1.intersection(line2);
                if (intersection == null) {
                    System.out.println("Doğrular paralel,kesişmezler");
                } else {
                    System.out.println("Kesişim Noktası: " + intersection);
                }

                System.out.println("Distance from p1 to p2: " + p1.distanceTo(p2));
                System.out.println("Distance from p1 to line1: " + p1.distanceTo(line1));
            }
        }


