package twodimensionalforms;

import auxiliare.Shape;
import auxiliare.ShapeGenerator;
import org.junit.Test;
import visitor.Picture;
import visitor.PicturePart;
import visitor.Visitor;

import java.util.List;

/**
 * Created by V3790147 on 5/4/2016.
 */
public class VisitorTest {

    @Test
    public void testVisitor(){
        ShapeGenerator shapeGenerator = new ShapeGenerator();
        List<Shape> shapeList = shapeGenerator.generateListShape();
        PicturePart picture = new Picture(shapeList);
        picture.accept(new Visitor());
    }

}
