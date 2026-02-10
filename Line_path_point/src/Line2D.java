import java.awt.*;

public class Line2D {
    private int m,n;

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public Line2D(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public String toString() {
        return "y=" + m + ", x=" + n;
    }

    public boolean isParallel(Line2D other) {

        if(m==other.getM()){
            return true;
        }
        return false;

    }
    public Point2D intersection(Line2D other) { //point türünden olduğu için Point2D dedim

        double x=0,y=0;
        int a=other.getM(); //y=mx+n ve y=ax+b
        int b=other.getN();
        if(!isParallel(other)){
             x = (double)(b - n )/ (m - a); //kesişim formülü
             y=m*x+n;

        }
        if(isParallel(other)){
            return null;
        }
        return new Point2D((int)x,(int) y); //yeni bir (x,y) nesnesi oluşturdum(constructor çağırdım)
    }










}
