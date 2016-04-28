package twodimensionalforms;

import auxiliare.Font;
import auxiliare.Point;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by v3790147 on 4/27/2016.
 */
public class SquareTest {

    private Square square;

    @Before
    public void init() {
        Point a = new Point(2, 2);
        Point b = new Point(3, 2);
        square = new Square(a, b);
    }

    @Test
    public void testDraw(){
        square.draw();
    }

    @Test
    public void testSetFont(){
        square.setFont(new Font("red", 4));
        square.draw();
    }

    @Test
    public void testToString(){
        System.out.println(square.toString());
    }
    @Test
    public void testArea() {
        square.calculateArea();
        Assert.assertTrue(square.getArea() == 1);
    }
}
