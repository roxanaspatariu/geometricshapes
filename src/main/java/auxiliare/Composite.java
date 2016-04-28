package auxiliare;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V3790147 on 4/28/2016.
 */
public class Composite {
    private Shape shape;
    private List<Shape> shapes;

    public Composite(Shape shape) {
        this.shape = shape;
        shapes = new ArrayList<Shape>();
    }

    public void addSubShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeSubShape(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getSubShapes() {
        return shapes;
    }

    @Override
    public String toString() {
        String msg = "";
        for (Shape shape : shapes) {
            msg = msg + ", " + shape.getName();
        }
        msg = ".";
        return msg;
    }
}
