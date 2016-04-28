package twodimensionalforms;

import auxiliare.Forms;
import auxiliare.Point;
import auxiliare.Side;

/**
 * Created by v3790147 on 4/27/2016.
 */
public class Rectangle extends Polygon {

    private Side sideMica;
    private Side sideMare;
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Rectangle() {
        this.setName(Forms.RECTANGLE.name());
        this.a = new Point(0, 0);
        this.b = new Point(0, 1);
        this.c = new Point(3, 1);
        this.c = new Point(3, 0);
    }

    public Rectangle(Point a, Point b, Point c) {
        this.setName(Forms.RECTANGLE.name());
        this.d = new Point(a.getX(), c.getY());
        double laturaMareSize = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
        double laturaMicaSize = Math.sqrt(Math.pow(b.getX() - c.getX(), 2) + Math.pow(b.getY() - c.getY(), 2));

        if ((b.getX() - a.getX()) / (c.getX() - a.getX()) != (b.getY() - a.getY()) / (c.getY() - a.getY())) {
            sideMica.setSize(laturaMicaSize);
            sideMare.setSize(laturaMareSize);
        } else {
            throw new IllegalArgumentException("You entered the wrong coordinates! The points are colinear!");
        }
    }


    @Override
    public double calculateArea() {
        return sideMare.getSize() * sideMica.getSize();
    }

    @Override
    public String toString() {
        String msg = "Rectangle with coordinates (" + (int)a.getX() + "," + (int)a.getY() + "), (" + (int)b.getX() + "," + (int)b.getY() + "), (" + (int)c.getX() + (int)c.getY() + ") " +
                " \n with area " + String.valueOf(super.getArea()) + ", \n" + super.getFont().getColor() + " with a border of " + String.valueOf(super.getFont().getBorderSize());
        System.out.println(msg);
        return msg;
    }
}
