package twodimensionalforms;

import auxiliare.*;
import exceptions.NegativeValuesException;
import visitor.PicturePart;
import visitor.PicturePartVisitor;

/**
 * Created by Roxana on 4/25/2016.
 */
public class Square extends Polygon {
    private Side side;
    private Point a;
    private Point b;
    private Point c;
    private Point d;


    public Square() {
        this.setName(Forms.SQUARE.name());
        this.a = new Point(0, 0);
        this.b = new Point(0, 1);
        this.c = new Point(1, 1);
        this.d = new Point(1, 0);
        side = new Side(a, b);
        side.calculateSize();

    }


    public Square(double sideSize, Point a) {
        this.setName(Forms.SQUARE.name());
        this.a = a;
        this.b = new Point(a.getX() + sideSize, a.getY());
        this.c = new Point(b.getX(), b.getY() + sideSize);
        this.d = new Point(a.getX(), a.getY() + sideSize);
        side = new Side();
        if(sideSize<0){
            try {
                throw new NegativeValuesException();
            } catch (NegativeValuesException e) {
                e.printStackTrace();
                side.setSize(Math.abs(sideSize));
            }
        }else {
            side.setSize(sideSize);
        }
    }

    public Square(Point a, Point b) {
        this.setName(Forms.SQUARE.name());
        side = new Side(a, b);
        side.calculateSize();
        if (!a.equals(b)) {
            this.a = a;
            this.b = b;
            this.c = new Point(b.getX(), b.getY() - side.getSize());
            this.d = new Point(a.getX(), a.getY() - side.getSize());
            side.setSize(side.getSize());
        } else {
            throw new IllegalArgumentException("The coordinates are incorrect! You can't draw a square!");
        }
    }

    public Square(Point a, Point b, Point c, Point d) {
        this.setName(Forms.SQUARE.name());
        Side ab = new Side(a, b);
        Side bc = new Side(b, c);
        ab.calculateSize();
        bc.calculateSize();

        if (ab.getSize() == bc.getSize()) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            side.setSize(ab.getSize());
        } else {
            throw new IllegalArgumentException("The coordinates are incorrect! You can't draw a square!");
        }
    }

    @Override
    public double calculateArea() {
        this.setArea(Math.pow(side.getSize(), 2));
        return Math.pow(side.getSize(), 2);
    }


    @Override
    public String toString() {
        return "Square with coordinates a(" + (int) a.getX() + "," + (int) a.getY() + "), b(" +
                (int) b.getX() + "," + (int) b.getY() + "), c(" + (int) c.getX() + (int) c.getY() + "), d(" + (int) d.getX() + "," + (int) d.getY() + ").";

    }

    @Override
    public void draw() {
        System.out.println("You're drawing a " + getFont().getColor() + " " + getName() + " with a border of " + getFont().getBorderSize() + " cm, at a("
                + (int) a.getX() + "," + (int) a.getY() + "), b(" + (int) b.getX() + "," + (int) b.getY() + "), c(" + (int) c.getX()
                + (int) c.getY() + "), d(" + (int) d.getX() + "," + (int) d.getY() + ").");
    }


    @Override
    public void accept(PicturePartVisitor visitor) {
        visitor.visit(this);
    }
}
