package twodimensionalforms;

import auxiliare.Point;
import auxiliare.Shape;
import org.junit.Assert;
import org.junit.Test;
import threedimensionalforms.Cube;

/**
 * Created by V3790147 on 4/28/2016.
 */
public class CompositeTest {

    @Test
    public void testAdd(){
        Shape shape = new Square(2, new Point(1,1));
        shape.addSubShape(new Circle());
        shape.addSubShape(new Rectangle());
        shape.addSubShape(new Cube());
        System.out.println(shape.showShapes());
        Assert.assertEquals(3, shape.getSubShapes().size());
    }

    @Test
    public void testRemove(){
        Shape shape = new Square(2, new Point(1,1));
        shape.addSubShape(new Circle());
        shape.addSubShape(new Rectangle());
        shape.addSubShape(new Cube());
        shape.removeSubShape(shape.getSubShapes().get(0));
        System.out.println(shape.showShapes());
        Assert.assertEquals(2, shape.getSubShapes().size());
    }
}

