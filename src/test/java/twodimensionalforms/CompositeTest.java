package twodimensionalforms;

import auxiliare.Composite;
import auxiliare.Forms;
import auxiliare.Point;
import auxiliare.Shape;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import threedimensionalforms.Cube;

/**
 * Created by V3790147 on 4/28/2016.
 */
public class CompositeTest {


    @Test
    public void testComposite(){

        Shape shape = new Square(2, new Point(1,1));
        shape.addSubShape(new Circle());
        shape.addSubShape(new Rectangle());
        shape.addSubShape(new Cube());
        Assert.assertEquals(3, shape.getSubShapes().size());

    }
}

