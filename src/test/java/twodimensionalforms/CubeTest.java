package twodimensionalforms;

import auxiliare.Font;
import auxiliare.Vector;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import threedimensionalforms.Cube;

/**
 * Created by V3790147 on 4/28/2016.
 */
public class CubeTest {

    private Cube cube;

    @Before
    public void init() {
        Vector a = new Vector(0, 0, 0);
        Vector b = new Vector(1, 0, 0);
        Vector c = new Vector(1, 0, 1);
        cube = new Cube(a, b, c);
    }

    @Test
    public void testDraw(){
        cube.draw();
    }

    @Test
    public void testSetFont(){
        cube.setFont("red", 4);
        cube.draw();
    }
    
    @Test
    public void testToString(){
        System.out.println(cube.toString());
    }
    @Test
    public void testArea() {
        Assert.assertTrue(cube.calculateArea() == 1);
    }

    @Test
    public void testDimension(){
        Assert.assertEquals(3, cube.getDimension());
    }

}
