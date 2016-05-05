package visitor;

import auxiliare.Shape;
import serializaze.ObjectToJSON;
import threedimensionalforms.Cube;
import twodimensionalforms.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V3790147 on 5/4/2016.
 */
public class JSONSerializationVisitor implements PicturePartVisitor {

    ObjectToJSON objectToJSON = new ObjectToJSON();

    @Override
    public void visit(Picture picture) {
        objectToJSON.writeJSON(picture);
    }

    @Override
    public void visit(Circle circle) {
        objectToJSON.writeJSON(circle);
    }

    @Override
    public void visit(Square square) {
        objectToJSON.writeJSON(square);
    }

    @Override
    public void visit(Trapeze trapeze) {
        objectToJSON.writeJSON(trapeze);
    }

    @Override
    public void visit(Triangle triangle) {
        objectToJSON.writeJSON(triangle);
    }

    @Override
    public void visit(Cube cube) {
        objectToJSON.writeJSON(cube);
    }

    @Override
    public void visit(Rectangle rectangle) {
        objectToJSON.writeJSON(rectangle);
    }
}
