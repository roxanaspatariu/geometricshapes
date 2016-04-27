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


    public Circle(){
        super.setName(Forms.CIRCLE.name());
        centru.setX(0);
        centru.setY(0);
        radius = 1;

    }

    public Circle(double radius){
        super.setName(Forms.CIRCLE.name());
        centru.setX(0);
        centru.setY(0);
        this.radius = radius;
    }

    public Circle(double radius, Point centru){
        super.setName(Forms.CIRCLE.name());
        centru.setX(centru.getX());
        centru.setY(centru.getY());
        this.radius = radius;
    }


    public double calculateCircleLength(){
        lungime = 2*Math.PI*radius;
        return lungime;
    }
    @Override
    public double calculateArea() {
        double area = 2*Math.PI*radius*radius;
        super.setArea(area);
        return area;
    }

    @Override
    public void setFont(String colour, double borderSize) {
        super.setFont(new Font(colour, borderSize));
    }

    @Override
    public void draw() {
        System.out.println("Desenezi un cerc de culoarea " + super.getFont().getColor() + " si bordura de " + super.getFont().getBorderSize() + "cm" );
    }

    @Override
    public String toString() {
        String msg ="Cerc cu aria " + String.valueOf(super.getArea()) + "de culoarea " + super.getFont().getColor() + " si bordura de dimens "  + String.valueOf(super.getFont().getBorderSize());
        System.out.println(msg);
        return msg;
    }
}
