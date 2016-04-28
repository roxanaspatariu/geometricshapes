package twodimensionalforms;

import auxiliare.Point;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by V3790147 on 4/28/2016.
 */
public class CircleTest {

    private Circle circle;

    @Before
    public void init() {
        Point a = new Point(2, 2);
        double radius = 1;
        circle = new Circle(radius, a);
    }

    @Test
    public void testArea() {
        circle.calculateArea();
        Assert.assertTrue(circle.getArea() == 2*Math.PI);
    }
}
