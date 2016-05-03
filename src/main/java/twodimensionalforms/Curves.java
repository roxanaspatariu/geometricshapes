package twodimensionalforms;

import auxiliare.Shape;
import threedimensionalforms.Cube;

/**
 * Created by Roxana on 4/25/2016.
 */
public abstract class Curves extends Shape {

    protected double radius;

    public Curves(){
        super();
        setDimension(2);
    }

    public Curves(Shape shape) {
        super(shape);
        setDimension(2);
    }

}
