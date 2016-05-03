package factory;

import auxiliare.Font;
import auxiliare.Forms;
import auxiliare.Shape;
import threedimensionalforms.Cube;
import twodimensionalforms.*;

/**
 * Created by Roxana on 4/25/2016.
 */
public class ShapeFactory {

    public Shape getShape(String shapeName) {
        Forms shape;
        try {
            shape = Forms.valueOf(shapeName);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("The shape doesn't exist!. You must specify one of the following: \n" +
                    "Circle/Square/Rectangle/Triangle/Trapeze/Cube");
        }
        switch (shape) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            case TRIANGLE:
                return new Triangle();
            case TRAPEZE:
                return new Trapeze();
            case CUBE:
                return new Cube();
        }
        return null;


    }

}
