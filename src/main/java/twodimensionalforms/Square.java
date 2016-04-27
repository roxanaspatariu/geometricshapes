package twodimensionalforms;

import auxiliare.*;

/**
 * Created by Roxana on 4/25/2016.
 */
public class Square extends Polygon implements Operations {
    private Side side = new Side();
    private Point a;
    private Point b;
    private Point c;
    private Point d;


    public Square() {
        super.setName(Forms.SQUARE.name());
        this.side.setSize(1);
    }

    public Square(double sideSize, Point a) {
        super.setName(Forms.SQUARE.name());
        this.a = a;
        this.b = new Point(a.getX() + sideSize, a.getY());
        this.c = new Point(b.getX(), b.getY() - sideSize);
        this.d = new Point(a.getX(), a.getY() + sideSize);
        side.setSize(sideSize);
    }

    public Square(Point a, Point b) {
        super.setName(Forms.SQUARE.name());
        double sideSize = Math.abs(a.getX() - b.getX());
        if (a.getX() != b.getX()) {
            this.a = a;
            this.b = b;
            this.c = new Point(b.getX(), b.getY() - sideSize);
            this.d = new Point(a.getX(), a.getY() - sideSize);
            side.setSize(sideSize);
        } else {
            throw new IllegalArgumentException("The coordinates are not corect! You can't construct a square!");
        }
    }

    public Square(Point a, Point b, Point c, Point d) {

        double ab = Math.sqrt((b.getX() - a.getX()) * (b.getX() - a.getX()) + (b.getY() - a.getY()) * (b.getY() - a.getY()));
        double bc = Math.sqrt((c.getX() - b.getX()) * (c.getX() - b.getX()) + (c.getY() - b.getY()) * (c.getY() - b.getY()));

        if (ab == bc) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            side.setSize(Math.abs(a.getX() - b.getX()));
        } else {
            throw new IllegalArgumentException("The coordinates are not corect! You can't construct a square!");
        }
    }

    @Override
    public double calculateArea() {
        double area = side.getSize() * side.getSize();
        super.setArea(area);
        return area;
    }

    @Override
    public void setFont(String color, double borderSize) {
        super.setFont(new Font(color, borderSize));
    }

    @Override
    public void draw() {
        System.out.println("Desenezi un patrat de culoarea " + super.getFont().getColor() + " si bordura de " + super.getFont().getBorderSize() + "cm");
        System.out.println("Patratul se afla la coordonatele (" + a.getX() + "), " + a.getX() + "(" + b.getX() + "," + b.getY() + "), (" + c.getX() + "," + c.getY() + "), (" + d.getX() + "," + d.getY() + ")");
    }
}
