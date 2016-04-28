package twodimensionalforms;

import auxiliare.Shape;

/**
 * Created by Roxana on 4/25/2016.
 */
public abstract class Polygon extends Shape {

    @Override
    public void setDimension(int dimension) {
        dimension = 2;
    }


}
