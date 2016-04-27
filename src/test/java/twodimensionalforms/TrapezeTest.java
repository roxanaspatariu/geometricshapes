package twodimensionalforms;

import auxiliare.Point;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by v3790147 on 4/27/2016.
 */
public class TrapezeTest {

    @Test
    public void testArea() {
        Point a = new Point(2, 2);
        Point b = new Point(3, 2);
        Point c = new Point(4, 1);
        Point d = new Point(1, 1);

        Trapeze trapeze = new Trapeze(a, b, c, d);
        trapeze.calculateArea();
        Assert.assertTrue(trapeze.getArea() == 2);
    }
}
