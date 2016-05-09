package auxiliare;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import threedimensionalforms.Cube;
import twodimensionalforms.Circle;
import twodimensionalforms.Square;
import twodimensionalforms.Trapeze;
import twodimensionalforms.Triangle;
import visitor.Picture;
import visitor.PicturePart;
import visitor.PicturePartVisitor;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roxana on 4/25/2016.
 */



@XmlType
@XmlSeeAlso({Circle.class, Square.class , Trapeze.class, Triangle.class,Cube.class,Picture.class})
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")

@JsonSubTypes({
        @JsonSubTypes.Type(value = Circle.class),
        @JsonSubTypes.Type(value = Square.class),
        @JsonSubTypes.Type(value = Trapeze.class),
        @JsonSubTypes.Type(value = Triangle.class),
        @JsonSubTypes.Type(value = Cube.class),
        @JsonSubTypes.Type(value = Picture.class)
})
public abstract class Shape implements Serializable, PicturePart{


    private String name;

    private double area;

    private int dimension;

    private Font font = new Font();

    @XmlElement
    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }



    public Font getFont() {
        return font;
    }

    public void setFont(String color, int borderSize) {
        this.font = new Font(color, borderSize);
    }
    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @XmlElement
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @JsonProperty("subShapes")
    private List<Shape> shapes;

    public Shape() {
        shapes = new ArrayList<Shape>();
    }

    public Shape(Shape shape) {
        this.name = shape.getName();
        this.area = shape.getArea();
        this.dimension = shape.getDimension();
        this.font = shape.getFont();
        this.shapes = shape.getSubShapes();
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
