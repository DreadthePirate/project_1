import org.jetbrains.annotations.NotNull;

public class Point {

    private double x;
    private double y;
    private double Point;
    private double shift;
    private double rotate;
    private double distance;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point() {

    }

    public double getX() {
        return x;
    }


    public void setX(double x) {
        this.x = x;
    }


    public double getY() {
        return y;
    }


    public void setY(double y) {
        this.y = y;
    }


    public double getPoint() {
        return Point;
    }


    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public void shiftX (double n) {
        x = x + n;
    }
    public void shiftY (double n) {
        y = y + n;
    }
    public void rotate (double angle) {
        double rx = x*Math.cos(angle) - y*Math.sin(angle);
        double ry = x*Math.cos(angle) - y*Math.sin(angle);
        x = Math.round(rx);
        y = Math.round(ry);
    }
    public double distance(Point p2) {
        double i = Math.pow((x-p2.x),2)+ Math.pow((y-p2.y),2);
        double z = Math.sqrt(i);
        return z;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", Point=" + Point +
                ", shift=" + shift +
                ", rotate=" + rotate +
                ", distance=" + distance +
                '}';
    }
}
