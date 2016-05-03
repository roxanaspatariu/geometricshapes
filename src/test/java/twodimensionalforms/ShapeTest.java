package twodimensionalforms;

import auxiliare.Font;
import auxiliare.Shape;
import org.junit.Test;

/**
 * Created by V3790147 on 5/3/2016.
 */
public class ShapeTest {
    @Test
    public void drawTest() {
        Shape shape = new Circle();
        shape.addSubShape(new Rectangle());
        shape.addSubShape(new Square());
        shape.draw();
    }

    @Test
    public void setFontTest() {
        Shape shape = new Rectangle();
        shape.setFont("red", 5);
        shape.viewFont();
    }
}