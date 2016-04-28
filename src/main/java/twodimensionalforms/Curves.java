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
    }

    public Curves(Shape shape) {
        super(shape);
    }

    @Override
    public void setDimension(int dimension) {
        dimension = 2;
    }

}
