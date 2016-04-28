package auxiliare;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roxana on 4/25/2016.
 */
public abstract class Shape extends Dimension {
    private String name;
    private double area;
    private double perimeter;

    private Font font = new Font();

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
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

    public Shape(){
        shapes = new ArrayList<Shape>();
    }

    public Shape(Shape shape) {
        shapes = new ArrayList<Shape>();
    }

    public void addSubShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeSubShape(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getSubShapes() {
        return shapes;
    }

    @Override
    public String toString() {
        String msg = "";
        for (Shape shape : shapes) {
            msg = msg + ", " + shape.getName();
        }
        msg = ".";
        return msg;
    }

}
