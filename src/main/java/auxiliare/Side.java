package auxiliare;

import java.io.Serializable;

/**
 * Created by Roxana on 4/25/2016.
 */
public class Side implements Serializable {
    private Point a;
    private Point b;
    private double size;

    public Side(){

    }
    public Side(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public void calculateSize() {
        this.size = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
