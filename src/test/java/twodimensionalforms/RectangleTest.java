package twodimensionalforms;

import auxiliare.Font;
import auxiliare.Point;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by V3790147 on 4/28/2016.
 */
public class RectangleTest {

    private Rectangle rectangle;

    @Before
    public void init() {
        Point a = new Point(2, 2);
        Point b = new Point(3, 2);
        Point c = new Point(3, 4);
        rectangle = new Rectangle(a, b, c);
    }

    @Test
    public void testDraw(){
        rectangle.draw();
    }

    @Test
    public void testSetFont(){
        rectangle.setFont("red", 4);
        rectangle.draw();
    }


    @Test
    public void testToString(){
        System.out.println(rectangle.toString());
    }
    @Test
    public void testArea() {
        Assert.assertTrue(rectangle.calculateArea() == 2);
    }

    @Test
    public void testDimension(){
        Assert.assertEquals(2, rectangle.getDimension());
    }
}
