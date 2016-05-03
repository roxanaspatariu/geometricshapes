package twodimensionalforms;

import auxiliare.Shape;

/**
 * Created by Roxana on 4/25/2016.
 */
public abstract class Polygon extends Shape {

    public Polygon(){
        super();
        super.setDimension(2);
    }

    public Polygon(Shape shape) {
        super(shape);
        super.setDimension(2);
    }


}
