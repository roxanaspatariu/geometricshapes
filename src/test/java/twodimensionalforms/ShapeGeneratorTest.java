package twodimensionalforms;

import auxiliare.Forms;
import auxiliare.Shape;
import auxiliare.ShapeGenerator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by V3790147 on 5/4/2016.
 */
public class ShapeGeneratorTest {

    private ShapeGenerator shapeGenerator;

    @Before
    public void init(){
        shapeGenerator = new ShapeGenerator();
    }

    @Test
    public void testGenerateShape(){
        System.out.println(shapeGenerator.generateShape().getName());
    }

    @Test
    public void testGenerateListShape(){
        List<Shape> shapes = shapeGenerator.generateListShape();
        Assert.assertNotNull(shapes);
    }

    @Test
    public void testDrawRandomSubshapes(){
        List<Shape> shapes = shapeGenerator.generateListShape();
        Shape shape = new Rectangle();
        shape.setSubShapes(shapes);
        shape.drawSubShapes();
    }

    @Test
    public void testEnum(){
        System.out.printf(String.valueOf(Forms.VALUES.length));
    }
}
