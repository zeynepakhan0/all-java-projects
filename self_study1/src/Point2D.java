public class Point2D {

   private int x,y;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distanceTo(Point2D other) { //bir noktanın diğer noktaya uzaklığını buldum
        int dx=other.getX()-x;
        int dy=other.getY()-y;
        if(dx<0){
            dx=-dx;
        }if(dy<0){
            dy=-dy;
        }
        return Math.sqrt(dx*dx+dy*dy);
    }

    public double distanceTo(Line2D line) { // doğru ve nokta arasındaki uzaklık formülünü kullandım
        double m = line.getM();
        double n = line.getN();

        double a = -m; //y-mx-n şeklinde olduğu için noktamız da (x,y)
        double b = 1;
        double c = -n;

        return Math.abs(a * this.x + b * this.y + c) / Math.sqrt(a * a + b * b);
    }
}




