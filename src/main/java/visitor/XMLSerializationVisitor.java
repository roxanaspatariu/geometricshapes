package visitor;

import serializaze.XMLDocumentSerializer;
import threedimensionalforms.Cube;
import twodimensionalforms.*;

/**
 * Created by V3790147 on 5/5/2016.
 */
public class XMLSerializationVisitor implements PicturePartVisitor {

    XMLDocumentSerializer serializer = XMLDocumentSerializer.getInstance();


    @Override
    public void visit(Picture picture) {
        serializer.setElementValue(picture);
    }

    @Override
    public void visit(Circle circle) {
        serializer.setElementValue(circle);
    }

    @Override
    public void visit(Square square) {
        serializer.setElementValue(square);
    }

    @Override
    public void visit(Trapeze trapeze) {
        serializer.setElementValue(trapeze);
    }

    @Override
    public void visit(Triangle triangle) {
        serializer.setElementValue(triangle);
    }

    @Override
    public void visit(Cube cube) {
        serializer.setElementValue(cube);
    }

    @Override
    public void visit(Rectangle rectangle) {
        serializer.setElementValue(rectangle);
    }

}
