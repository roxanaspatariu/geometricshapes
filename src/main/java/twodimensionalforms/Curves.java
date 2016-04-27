package twodimensionalforms;

import auxiliare.Shape;

/**
 * Created by Roxana on 4/25/2016.
 */
public abstract class Curves extends Shape {

    protected double radius;

    @Override
    public void setDimension(int dimension) {
        dimension = 2;
    }

}
