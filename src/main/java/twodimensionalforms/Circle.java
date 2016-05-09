package twodimensionalforms;

import auxiliare.Forms;
import auxiliare.Point;
import exceptions.NegativeValuesException;
import visitor.PicturePart;
import visitor.PicturePartVisitor;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Roxana on 4/25/2016.
 */
@XmlRootElement
public class Circle extends Curves {
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
        if(radius<0) {
            throw new NegativeValuesException();
        }else{
            this.radius = radius;
        }
    }

    public Circle(double radius, Point centru) {
        this.setName(Forms.CIRCLE.name());
        this.centru = new Point(centru.getX(), centru.getY());
        if(radius<0) {
            throw new NegativeValuesException();
        }else {
            this.radius = radius;
        }
    }


    public double calculateCircleLength() {
        lungime = 2 * Math.PI * radius;
        return lungime;
    }


    public double calculateArea() {
        double area = 2 * Math.PI * Math.pow(radius, 2);
        super.setArea(area);
        return area;
    }

    @Override
    public String toString() {
        return "Circle at (" + (int) centru.getX() + "," + (int) centru.getY() + "), with radius " + (int) radius + " cm";
    }

    public void draw() {
        System.out.println("You're drawing a " + getFont().getColor() + " " + getName() + " with a border of" +
                " " + getFont().getBorderSize() + " cm, at (" + (int) centru.getX() + "," + (int) centru.getY() +"), with radius " + (int) radius + " cm." );
    }

    @Override
    public void accept(PicturePartVisitor visitor) {
        visitor.visit(this);
    }
}
