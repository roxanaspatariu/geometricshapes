package twodimensionalforms;

import auxiliare.Point;
import twodimensionalforms.Polygon;

/**
 * Created by Roxana on 4/25/2016.
 */
public class Triangle extends Polygon {

    Point a;
    Point b;
    Point c;
    double height;
    double det;

    public Triangle(Point a, Point b, Point c) {
        if(a.equals(b) || b.equals(c) || a.equals(c)){
            throw new IllegalArgumentException("You put 2 similar points!");
        }else {
            this.a = a;
            this.b = b;
            this.c = c;
            // determinantul matricei formate din prima col coord x ale lui a,b,c, a doua col coord y ale lui a, b, c si a treia col unitate
            det = a.getX()*b.getY() + a.getY()*c.getX() + b.getX()* c.getY() - b.getY()*c.getX() - a.getX()*c.getY() - a.getY()*b.getX();
            height = Math.abs(det)/Math.sqrt((b.getX() - a.getX())*(b.getX() - a.getX()) + (b.getY()-a.getY())*(b.getY()-a.getY()));
        }
    }

    public Triangle() {
        this.a = new Point(1,1);
        this.b = new Point(0,0);
        this.c = new Point(2,0);
    }

    @Override
    public double calculateArea() {
        return 1/2*Math.abs(det);
    }
}
