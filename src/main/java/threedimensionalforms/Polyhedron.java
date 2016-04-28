package threedimensionalforms;

import auxiliare.Shape;

/**
 * Created by Roxana on 4/25/2016.
 */
public abstract class Polyhedron extends Shape {
    @Override
    public void setDimension(int dimension) {
        dimension = 3;
    }

}
