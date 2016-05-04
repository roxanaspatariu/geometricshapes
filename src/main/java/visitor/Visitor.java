package visitor;

import serializaze.JacksonTest;
import threedimensionalforms.Cube;
import twodimensionalforms.*;

/**
 * Created by V3790147 on 5/4/2016.
 */
public class Visitor implements PicturePartVisitor {

    JacksonTest jacksonTest = new JacksonTest();

   /* @Override
    public void visit(Picture picture) {
        jacksonTest.writeJSON();
    }*/

    @Override
    public void visit(Circle circle) {
        jacksonTest.writeJSON(circle);
    }

    @Override
    public void visit(Square square) {
        jacksonTest.writeJSON(square);
    }

    @Override
    public void visit(Trapeze trapeze) {
        jacksonTest.writeJSON(trapeze);
    }

    @Override
    public void visit(Triangle triangle) {
        jacksonTest.writeJSON(triangle);
    }

    @Override
    public void visit(Cube cube) {
        jacksonTest.writeJSON(cube);
    }

    @Override
    public void visit(Rectangle rectangle) {
        jacksonTest.writeJSON(rectangle);
    }
}
