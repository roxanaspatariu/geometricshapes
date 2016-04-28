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

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public abstract double calculateArea();

}
