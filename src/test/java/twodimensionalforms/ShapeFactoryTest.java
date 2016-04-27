package twodimensionalforms;

import auxiliare.ShapeFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by v3790147 on 4/27/2016.
 */
public class ShapeFactoryTest {

    @Test
    public void verifyShapeType(){
       ShapeFactory shapeFactory = new ShapeFactory("Circle");
       Assert.assertTrue(shapeFactory.getCircles().get(0).getName().equals("Circle"));
    }

    @Test
    public void verifyNrOfObjects(){
        ShapeFactory shapeFactory = new ShapeFactory("Circle");
        Assert.assertEquals(20, shapeFactory.getCircles().size());
    }


}
