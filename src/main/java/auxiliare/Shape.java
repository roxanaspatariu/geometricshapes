package auxiliare;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roxana on 4/25/2016.
 */
public abstract class Shape {
    private String name;
    private double area;
    private int dimension;

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    private Font font = new Font();

    public Font getFont() {
        return font;
    }

    public void setFont(String color, int borderSize) {
        this.font = new Font(color, borderSize);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    private List<Shape> shapes;

    public Shape() {
        shapes = new ArrayList<Shape>();
    }

    public Shape(Shape shape) {
        shapes = new ArrayList<Shape>();
    }

    public void addSubShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeSubShape(Shape shape) {
        shapes.remove(shape);
    }

    public List<Shape> getSubShapes() {
        return shapes;
    }

    public  void draw() {
        System.out.println("You're drawing a "+ font.getColor()+ " " +name + " with a border of "+font.getBorderSize()+" cm" );
        for (Shape shape : this.getSubShapes()) {
            System.out.println("Subshape: ");
            shape.draw();
        }
    }

    public void viewFont(){
        System.out.println("You're drawing a "+ font.getColor()+ " " +name + " with a border of "+font.getBorderSize()+" cm" );
    }

    public abstract double calculateArea();

}
