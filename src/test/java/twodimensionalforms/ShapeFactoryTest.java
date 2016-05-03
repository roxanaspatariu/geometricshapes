package twodimensionalforms;

import auxiliare.Forms;
import auxiliare.Shape;
import factory.ShapeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by v3790147 on 4/27/2016.
 */
public class ShapeFactoryTest {

    ShapeFactory shapeFactory;

    @Before
    public void init(){
        shapeFactory = new ShapeFactory();
    }

    @Test
    public void testGetShape1(){
        Shape shape = shapeFactory.getShape(Forms.CIRCLE.name());
        Assert.assertEquals("CIRCLE", shape.getName());

    }

    @Test
    public void testWrongArgument(){
        Shape shape1 = shapeFactory.getShape("cerc");
        Assert.assertEquals("cerc", shape1.getName());
    }


}
