package visitor;

import serializaze.CreateXMLDocument;
import threedimensionalforms.Cube;
import twodimensionalforms.*;

/**
 * Created by V3790147 on 5/5/2016.
 */
public class XMLSerializationVisitor implements PicturePartVisitor {

    CreateXMLDocument createXMLDocument = CreateXMLDocument.getInstance();


    @Override
    public void visit(Picture picture) {
        createXMLDocument.setElementValue(picture);
    }

    @Override
    public void visit(Circle circle) {
        createXMLDocument.setElementValue(circle);
    }

    @Override
    public void visit(Square square) {
        createXMLDocument.setElementValue(square);
    }

    @Override
    public void visit(Trapeze trapeze) {
        createXMLDocument.setElementValue(trapeze);
    }

    @Override
    public void visit(Triangle triangle) {
        createXMLDocument.setElementValue(triangle);
    }

    @Override
    public void visit(Cube cube) {
        createXMLDocument.setElementValue(cube);
    }

    @Override
    public void visit(Rectangle rectangle) {
        createXMLDocument.setElementValue(rectangle);
    }

}
