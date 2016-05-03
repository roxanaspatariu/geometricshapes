package threedimensionalforms;

import auxiliare.Shape;

/**
 * Created by Roxana on 4/25/2016.
 */
public abstract class Polyhedron extends Shape {

    public Polyhedron(){
        super();
        super.setDimension(3);
    }

    public Polyhedron(Shape shape) {
        super(shape);
        super.setDimension(3);
    }


}
