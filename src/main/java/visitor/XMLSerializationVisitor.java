package visitor;

import serializaze.CreateXMLDocument;
import threedimensionalforms.Cube;
import twodimensionalforms.*;

/**
 * Created by V3790147 on 5/5/2016.
 */
public class XMLSerializationVisitor implements PicturePartVisitor {

    CreateXMLDocument createXMLDocument = new CreateXMLDocument();

    @Override
    public void visit(Picture picture) {
        createXMLDocument.setElementValue(picture.getName(), picture.getArea(), picture.getDimension(), picture.getFont().getColor(), picture.getFont().getBorderSize());
    }

    @Override
    public void visit(Circle circle) {
        createXMLDocument.setElementValue(circle.getName(), circle.getArea(), circle.getDimension(), circle.getFont().getColor(), circle.getFont().getBorderSize());
    }

    @Override
    public void visit(Square square) {
        createXMLDocument.setElementValue(square.getName(), square.getArea(), square.getDimension(), square.getFont().getColor(), square.getFont().getBorderSize());
    }

    @Override
    public void visit(Trapeze trapeze) {
        createXMLDocument.setElementValue(trapeze.getName(), trapeze.getArea(), trapeze.getDimension(), trapeze.getFont().getColor(), trapeze.getFont().getBorderSize());

    }

    @Override
    public void visit(Triangle triangle) {
        createXMLDocument.setElementValue(triangle.getName(), triangle.getArea(), triangle.getDimension(), triangle.getFont().getColor(), triangle.getFont().getBorderSize());
    }

    @Override
    public void visit(Cube cube) {
        createXMLDocument.setElementValue(cube.getName(), cube.getArea(), cube.getDimension(), cube.getFont().getColor(), cube.getFont().getBorderSize());
    }

    @Override
    public void visit(Rectangle rectangle) {
        createXMLDocument.setElementValue(rectangle.getName(), rectangle.getArea(), rectangle.getDimension(), rectangle.getFont().getColor(), rectangle.getFont().getBorderSize());
    }
}
