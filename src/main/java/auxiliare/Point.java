package auxiliare;

import java.awt.*;

/**
 * Created by Roxana on 4/25/2016.
 */
public class Point extends Dimension {

    private double x;
    private double y;

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setDimension(int dimension) {
        dimension = 1;
    }
}
