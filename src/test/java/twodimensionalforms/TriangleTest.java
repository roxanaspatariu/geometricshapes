package twodimensionalforms;

import auxiliare.Font;
import auxiliare.Point;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by V3790147 on 4/28/2016.
 */
public class TriangleTest {

    private Triangle triangle;

    @Before
    public void init() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 1);
        Point c = new Point(2, 0);
        triangle = new Triangle(a, b, c);
    }

    @Test
    public void testDraw() {
        triangle.draw();
    }

    @Test
    public void testSetFont() {
        triangle.setFont("red", 4);
        triangle.draw();
    }

    @Test
    public void testToString() {
        System.out.println(triangle.toString());
    }

    @Test
    public void testArea() {
        Assert.assertTrue(triangle.calculateArea() == 1);
    }
    @Test
    public void testDimension(){
        Assert.assertEquals(2, triangle.getDimension());
    }
}
