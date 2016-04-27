package threedimensionalforms;

import auxiliare.Shape;

/**
 * Created by Roxana on 4/25/2016.
 */
public class Polyhedron extends Shape {
    @Override
    public void setDimension(int dimension) {
        dimension = 3;
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}
