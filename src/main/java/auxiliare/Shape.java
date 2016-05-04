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
        if (shapes.isEmpty()) {
            throw new NullPointerException("The list of subshapes is empty");
        } else {
            shapes.remove(shape);
        }
    }

    public List<Shape> getSubShapes() {
        return shapes;
    }

    public void setSubShapes(List<Shape> shapes) {
        this.shapes.addAll(shapes);
    }

    public void drawSubShapes() {
        this.draw();
        for (Shape shape : this.getSubShapes()) {
            System.out.print("Subshapes: ");
            shape.draw();
        }
    }

    public void draw() {
        System.out.println("You're drawing a " + getFont().getColor() + " " + getName() + " with a border of " + getFont().getBorderSize() + " cm");
    }

    public void viewFont() {
        System.out.println("You're drawing a " + font.getColor() + " " + name + " with a border of " + font.getBorderSize() + " cm");
    }

    public abstract double calculateArea();


}
