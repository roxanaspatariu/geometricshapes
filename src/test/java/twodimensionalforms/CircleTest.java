package twodimensionalforms;

import auxiliare.Font;
import auxiliare.Point;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by V3790147 on 4/28/2016.
 */
public class CircleTest {

    private Circle circle;
    double radius;
    @Before
    public void init() {
        Point a = new Point(2, 2);
        radius = 1;
        circle = new Circle(radius, a);
    }


    @Test
    public void testDraw() {
        circle.draw();
    }

    @Test
    public void testSetFont() {
        circle.setFont("red", 4);
        circle.draw();
    }

    @Test
    public void testCalculateCircleLength() {
        Assert.assertTrue(circle.calculateCircleLength() == 2 * Math.PI * radius);
    }

    @Test
    public void testToString() {
        System.out.println(circle.toString());
    }

    @Test
    public void testArea() {
        circle.calculateArea();
        Assert.assertTrue(circle.getArea() == 2*Math.PI);
    }

    @Test
    public void testDimension(){
        Assert.assertEquals(2, circle.getDimension());
    }
}
