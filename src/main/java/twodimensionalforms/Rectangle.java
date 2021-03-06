package twodimensionalforms;

import auxiliare.*;
import visitor.PicturePart;
import visitor.PicturePartVisitor;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by v3790147 on 4/27/2016.
 */
@XmlRootElement
public class Rectangle extends Polygon {

    private Side smallSide;
    private Side greatSide;
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Rectangle() {
        this.setName(Forms.RECTANGLE.name());
        this.a = new Point(0, 0);
        this.b = new Point(0, 1);
        this.c = new Point(1, 3);
        this.d = new Point(0, 3);
        smallSide = new Side(a, b);
        greatSide = new Side(b, c);
        smallSide.calculateSize();
        greatSide.calculateSize();
    }


    public Rectangle(Point a, Point b, Point c) {
        this.setName(Forms.RECTANGLE.name());
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new Point(a.getX(), c.getY());
        double greatSideSize = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
        double smallSideSize = Math.sqrt(Math.pow(b.getX() - c.getX(), 2) + Math.pow(b.getY() - c.getY(), 2));

        if ((b.getX() - a.getX()) / (c.getX() - a.getX()) != (b.getY() - a.getY()) / (c.getY() - a.getY())) {
            smallSide = new Side();
            greatSide = new Side();
            smallSide.setSize(smallSideSize);
            greatSide.setSize(greatSideSize);
        } else {
            throw new IllegalArgumentException("You entered the wrong coordinates! The points are colinear!");
        }
    }


    @Override
    public double calculateArea() {
        return greatSide.getSize() * smallSide.getSize();
    }

    @Override
    public String toString() {
        return "Rectangle with coordinates a(" + (int) a.getX() + "," + (int) a.getY() + "), b(" + (int) b.getX() + "," + (int) b.getY() + "), c(" + (int) c.getX() + "," + (int) c.getY() + "), d(" +
                +(int) d.getX() + "," + (int) d.getY() + ").";

    }

    @Override
    public void draw() {
        System.out.println("You're drawing a " + getFont().getColor() + " " + getName() + " with a border of " + getFont().getBorderSize() + " cm, at a(" +
                (int) a.getX() + "," + (int) a.getY() + "), b(" + (int) b.getX() + "," + (int) b.getY() + "), c(" + (int) c.getX() + "," + (int) c.getY() + "), d(" +
                +(int) d.getX() + "," + (int) d.getY() + ").");
    }


    @Override
    public void accept(PicturePartVisitor visitor) {
        visitor.visit(this);
    }
}
