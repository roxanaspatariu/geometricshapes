package auxiliare;

import threedimensionalforms.Cube;
import twodimensionalforms.*;

/**
 * Created by Roxana on 4/25/2016.
 */
public class ShapeFactory {

    public Shape getShape(String shapeName) {
        Forms shape = Forms.valueOf(shapeName);
        if(shapeName == null){
            return null;
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
