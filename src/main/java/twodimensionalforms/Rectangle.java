package twodimensionalforms;

import auxiliare.Side;
import auxiliare.Point;

/**
 * Created by v3790147 on 4/27/2016.
 */
public class Rectangle extends Polygon{

    private Side sideMica;
    private Side sideMare;
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Rectangle(Point a, Point b, Point c, Point d){
        double laturaMicaSize1 = Math.abs(a.getX() - b.getX());
        double laturaMicaSize2 = Math.abs(c.getX() - d.getX());
        double laturaMareSize1 = Math.abs(b.getX() - c.getX());
        double laturaMareSize2 = Math.abs(a.getX() - d.getX());

        if(laturaMareSize1 == laturaMareSize2 && laturaMicaSize1 == laturaMicaSize2){
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            sideMica.setSize(laturaMicaSize1);
            sideMare.setSize(laturaMareSize1);
        } else{
            throw new IllegalArgumentException("You entered the wrong coordinates!");
        }

    }
    @Override
    public double calculateArea() {
        return sideMare.getSize()* sideMica.getSize();
    }
}
