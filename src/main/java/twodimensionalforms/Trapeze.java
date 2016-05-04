package twodimensionalforms;

import auxiliare.*;
import visitor.PicturePart;
import visitor.PicturePartVisitor;

/**
 * Created by Roxana on 4/25/2016.
 */
public class Trapeze extends Polygon {

    private Side smallBase;
    private Side greatBase;
    private Side height;
    private Point a, b, c, d;


    public Trapeze(Point a, Point b, Point c, Point d) {
        this.setName(Forms.TRAPEZE.name());
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

        if (a.getX() < b.getX() && a.getY() == b.getY() && c.getX() > d.getX() && c.getY() == d.getY()) {
            smallBase = new Side(a, b);
            greatBase = new Side(c, d);
            height = new Side();
            smallBase.calculateSize();
            greatBase.calculateSize();
            height.setSize(a.getY() - d.getY());
        } else {
            throw new IllegalArgumentException("You should put the points clockwise starting from point a!");
        }
    }

    public Trapeze() {
        this.setName(Forms.TRAPEZE.name());
        a = new Point(1, 1);
        b = new Point(2, 1);
        c = new Point(0, 3);
        d = new Point(0, 0);
        smallBase = new Side(a, b);
        greatBase = new Side(c, d);
        smallBase.calculateSize();
        greatBase.calculateSize();

    }

    public Trapeze(double smallBase, double greatBase, double height) {
        super.setName(Forms.TRAPEZE.name());
        a = new Point(0, height);
        b = new Point(0, 0);
        c = new Point(smallBase, height);
        d = new Point(greatBase, 0);
    }

    @Override
    public double calculateArea() {
        double area = ((greatBase.getSize() + smallBase.getSize()) * height.getSize()) / 2;
        super.setArea(area);
        return area;
    }


    @Override
    public String toString() {
        return "Trapeze with coordinates a(" + (int) a.getX() + "," + (int) a.getY() + "), b(" + (int) b.getX() + "," + (int) b.getY() + "), c(" + (int) c.getX() + (int) c.getY() + "), d(" +
                (int) d.getX() + "," + (int) d.getY() + ") ";

    }

    @Override
    public void draw() {
        System.out.println("You're drawing a " + getFont().getColor() + " " + getName() + " with a border of " + getFont().getBorderSize()
                + " cm, at a(" + (int) a.getX() + "," + (int) a.getY() + "), b(" + (int) b.getX() + "," + (int) b.getY() + "), c(" + (int) c.getX() + (int) c.getY() + "), d(" +
                (int) d.getX() + "," + (int) d.getY() + ") ");
    }

    @Override
    public void accept(PicturePartVisitor visitor) {
        visitor.visit(this);
    }
}
