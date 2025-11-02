import java.util.ArrayList;

public class Path2D {

    private ArrayList<Point2D> points;

    public Path2D() {
        points = new ArrayList<>();
    }

    public ArrayList<Point2D> getPoints() {
        return points;
    }

    public String toString() {
        String result = ""; //boş başlattım

        for (int i = 0; i < points.size(); i++) {
            result += "(" + points.get(i).getX() + ", " + points.get(i).getY() + ")"; //(x,y)

            if (i < points.size() - 1) { //yani sona ulaşmadığımız sürece === ekliypruz aralarına
                result += " === ";
            }
        }
        return result;
    }

    public int size() {
        return points.size();
    }

    public double length() {

        double total=0;
        for(int i=0; i<points.size()-1; i++) { //burda hata aldım ve size-1 dedim çünkü
            // diğer türlü olmayan bir değere ulaşmaya çalışacaktı
            total+=points.get(i).distanceTo(points.get(i+1)); //yani her bir noktada total distance'ı arttırdım
        }
    return total;
    }

    public void addPoint(Point2D point) {
        points.add(point);
    }

    public Path2D combine(Path2D other) {
        Path2D result = new Path2D(); //ortak nesne(other ve this birleşimleri)
        for(int i=0; i<points.size(); i++) {
            result.addPoint(this.points.get(i)); //this'teki pointleri resulta ekledim
        }

        for(int i=0; i<other.points.size(); i++) {
            result.addPoint(other.points.get(i)); //other'daki pointleri resulta ekledim
        }

        return result;
    }

}