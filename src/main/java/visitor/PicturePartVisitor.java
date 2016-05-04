package visitor;

import auxiliare.Shape;
import threedimensionalforms.Cube;
import twodimensionalforms.*;

/**
 * Created by V3790147 on 5/4/2016.
 */
public interface PicturePartVisitor {

   // void visit(Picture picture);
    void visit(Circle circle);
    void visit(Square square);
    void visit(Trapeze trapeze);
    void visit(Triangle triangle);
    void visit(Cube cube);
    void visit(Rectangle rectangle);

}
