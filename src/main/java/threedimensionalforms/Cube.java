package threedimensionalforms;

import auxiliare.Vector;

/**
 * Created by Roxana on 4/25/2016.
 */
public class Cube extends Polyhedron {

    Vector a;
    Vector b;
    Vector c;
    Vector d;
    Vector e;
    Vector f;
    Vector g;
    Vector h;
    double sideLength;

    public Cube() {
    }

    public Cube(Vector a, Vector b) {
        sideLength = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideLength,3);
    }
}
