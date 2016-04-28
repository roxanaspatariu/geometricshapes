package twodimensionalforms;

import auxiliare.Font;
import auxiliare.Point;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by v3790147 on 4/27/2016.
 */
public class TrapezeTest {

    private Trapeze trapeze;

    @Before
    public void init() {
        Point a = new Point(2, 2);
        Point b = new Point(3, 2);
        Point c = new Point(4, 1);
        Point d = new Point(1, 1);
        trapeze = new Trapeze(a, b, c, d);
    }
    @Test
    public void testDraw(){
        trapeze.draw();
    }

    @Test
    public void testSetFont(){
        trapeze.setFont(new Font("red", 4));
        trapeze.draw();
    }

    @Test
    public void testToString(){
        System.out.println(trapeze.toString());
    }
    @Test
    public void testArea() {
        trapeze.calculateArea();
        Assert.assertTrue(trapeze.getArea() == 2);
    }
}
