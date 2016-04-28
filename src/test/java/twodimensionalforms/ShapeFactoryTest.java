package twodimensionalforms;

import auxiliare.Forms;
import auxiliare.Shape;
import auxiliare.ShapeFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by v3790147 on 4/27/2016.
 */
public class ShapeFactoryTest {

    @Test
    public void testShapeFactory(){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape(Forms.CIRCLE.name());
        Assert.assertEquals("CIRCLE", shape.getName());
    }
}
