package serializers;

import auxiliare.Shape;
import auxiliare.ShapeGenerator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import serializaze.ObjectToTxt;

/**
 * Created by V3790147 on 5/9/2016.
 */
public class TxtSerializeDeserializeTest {

    ShapeGenerator shapeGenerator;
    Shape shape;
    ObjectToTxt objectToTxt;

    @Before
    public void init(){
        shapeGenerator = new ShapeGenerator();
        shape = shapeGenerator.generateShape();
        objectToTxt = new ObjectToTxt();
    }

    @Test
    public void testSerializeObjectToTxt(){
        objectToTxt.serializeToTxt(shape, "shapes.txt");
    }

    @Test
    public void testDeserializeObjectToTxt(){
        Shape shapeE = objectToTxt.deserializeToTxt("shapes.txt");
        Assert.assertNotNull(shapeE);
    }
}
