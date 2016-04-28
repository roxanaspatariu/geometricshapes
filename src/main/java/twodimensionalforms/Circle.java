package twodimensionalforms;

import auxiliare.Font;
import auxiliare.Forms;
import auxiliare.Operations;
import auxiliare.Point;

/**
 * Created by Roxana on 4/25/2016.
 */
public class Circle extends Curves implements Operations {
    private double lungime;
    private Point centru;


    public Circle() {
        this.setName(Forms.CIRCLE.name());
        this.centru = new Point(0, 0);
        radius = 1;

    }

    public Circle(double radius) {
        this.setName(Forms.CIRCLE.name());
        this.centru = new Point(0, 0);
        this.radius = radius;
    }

    public Circle(double radius, Point centru) {
        this.setName(Forms.CIRCLE.name());
        this.centru = new Point(centru.getX(), centru.getY());
        this.radius = radius;
    }


    public double calculateCircleLength() {
        lungime = 2 * Math.PI * radius;
        return lungime;
    }

    @Override
    public double calculateArea() {
        double area = 2 * Math.PI * Math.pow(radius, 2);
        super.setArea(area);
        return area;
    }

    @Override
    public void setFont(String colour, double borderSize) {
        this.setFont(new Font(colour, borderSize));
    }

    @Override
    public void draw() {
        System.out.println("You're drawing a " + this.getFont().getColor() + " circle with a border of " + String.valueOf((int)this.getFont().getBorderSize()) + "cm");
    }

    @Override
    public String toString() {
        return "Circle at (" + (int)centru.getX() + "," + (int)centru.getY() + "), with radius " + (int)radius + " cm";
    }
}
