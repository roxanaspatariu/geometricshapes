package twodimensionalforms;

import auxiliare.Point;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by v3790147 on 4/27/2016.
 */
public class SquareTest {

    @Test
    public void testArea() {
        Point a = new Point(2, 2);
        Point b = new Point(3, 2);

        Square square = new Square(a, b);
        square.calculateArea();
        Assert.assertTrue(square.getArea() == 1);
    }
}
