package threedimensionalforms;

import auxiliare.Shape;

/**
 * Created by Roxana on 4/25/2016.
 */
public abstract class CurvedSurfaces extends Shape {
    @Override
    public void setDimension(int dimension) {
        dimension = 3;
    }

    private final double pi = Math.PI;
    private double radius;
}
