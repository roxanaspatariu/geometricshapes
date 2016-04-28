package twodimensionalforms;

import auxiliare.Shape;

/**
 * Created by Roxana on 4/25/2016.
 */
public abstract class Polygon extends Shape {

    public Polygon(){
        super();
    }

    public Polygon(Shape shape) {
        super(shape);
    }

    @Override
    public void setDimension(int dimension) {
        dimension = 2;
    }


}
