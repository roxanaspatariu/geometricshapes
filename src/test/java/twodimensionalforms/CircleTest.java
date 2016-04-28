package twodimensionalforms;

import auxiliare.Point;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by V3790147 on 4/28/2016.
 */
public class CircleTest {
    @Test
    public void testArea() {
        Point a = new Point(2, 2);
        double radius = 1;

        Circle circle = new Circle(radius, a);
        circle.calculateArea();
        Assert.assertTrue(circle.getArea() == 2*Math.PI);
    }
}
