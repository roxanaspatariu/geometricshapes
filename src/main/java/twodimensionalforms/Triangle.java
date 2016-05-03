package twodimensionalforms;

import auxiliare.Point;

/**
 * Created by Roxana on 4/25/2016.
 */
public class Triangle extends Polygon {

    private Point a;
    private Point b;
    private Point c;
    private double height;
    private double det;

    public Triangle(Point a, Point b, Point c) {
        if (a.equals(b) || b.equals(c) || a.equals(c)) {
            throw new IllegalArgumentException("You put 2 similar points!");
        } else if ((b.getX() - a.getX()) / (c.getX() - a.getX()) == (b.getY() - a.getY()) / (c.getY() - a.getY())) {
            throw new IllegalArgumentException("The point are colinear!");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
            // The determinant of the matrix is build of the following 3 columns : the first having the x values of the 3 points, the second the y values of the 3 points
            // and the last column is o unit column
            det = a.getX() * b.getY() + a.getY() * c.getX() + b.getX() * c.getY() - b.getY() * c.getX() - a.getX() * c.getY() - a.getY() * b.getX();
            height = Math.abs(det) / Math.sqrt((b.getX() - a.getX()) * (b.getX() - a.getX()) + (b.getY() - a.getY()) * (b.getY() - a.getY()));
        }
    }

    public Triangle() {
        this.a = new Point(1, 1);
        this.b = new Point(0, 0);
        this.c = new Point(2, 0);
    }

    @Override
    public double calculateArea() {
        return Math.abs(det) * 1 / 2;
    }

    @Override
    public String toString() {
        return "Triangle with coordonates at a(" + (int)a.getX() + "," + (int)a.getY() + "), b(" + (int)b.getX() + "," + (int)b.getY() + "), c(" + (int)c.getX() + "," + (int)c.getY() + ").";
    }


}
