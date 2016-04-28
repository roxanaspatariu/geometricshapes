package twodimensionalforms;

import auxiliare.*;

/**
 * Created by Roxana on 4/25/2016.
 */
public class Trapeze extends Polygon implements Operations {

    private Side smallBase = new Side();
    private Side greatBase = new Side();
    private Side height = new Side();
    private Point a, b, c, d;


    public Trapeze(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;


        if (a.getX() < b.getX() && a.getY() == b.getY() && c.getX() > d.getX() && c.getY() == d.getY()) {
            smallBase.setSize(b.getX() - a.getX());
            greatBase.setSize(c.getX() - d.getX());
            height.setSize(a.getY() - d.getY());
        } else {
            throw new IllegalArgumentException("You should put the points clockwise starting from point a!");
        }
    }

    public Trapeze() {
        super.setName(Forms.TRAPEZE.name());
        a = new Point(0, 1);
        b = new Point(0, 0);
        c = new Point(1, 1);
        d = new Point(2, 0);

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
    public void setFont(String color, double borderSize) {
        super.setFont(new Font(color, borderSize));
    }

    @Override
    public void draw() {
        System.out.println("You're drawing a " + super.getFont().getColor() + " trapeze with a border of " + super.getFont().getBorderSize() + "cm");
    }

}
