package composite;

import auxiliare.Point;
import auxiliare.Shape;
import com.sun.org.glassfish.external.arc.Taxonomy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import threedimensionalforms.Cube;
import twodimensionalforms.Circle;
import twodimensionalforms.Rectangle;
import twodimensionalforms.Square;

/**
 * Created by V3790147 on 4/28/2016.
 */
public class CompositeTest {

    private Shape shape;

    @Before
    public void init(){
        shape = new Square(2, new Point(1,1));
    }

    @Test
    public void testAdd(){

        shape.addSubShape(new Circle());
        shape.addSubShape(new Rectangle());
        shape.addSubShape(new Cube());
        Assert.assertEquals(3, shape.getSubShapes().size());
    }

    @Test
    public void testRemove(){
        shape.addSubShape(new Circle());
        shape.addSubShape(new Rectangle());
        shape.addSubShape(new Cube());
        shape.removeSubShape(shape.getSubShapes().get(0));
        Assert.assertEquals(2, shape.getSubShapes().size());
    }

    @Test
    public void testRemoveEmptySubshapeList(){
        shape.getSubShapes().clear();
        shape.removeSubShape(shape.getSubShapes().get(0));
    }
}

