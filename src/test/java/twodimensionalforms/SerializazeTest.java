package twodimensionalforms;

import auxiliare.Shape;
import org.junit.Test;
import serializaze.JacksonTest;

/**
 * Created by V3790147 on 5/4/2016.
 */
public class SerializazeTest {

    @Test
    public void testSerializaze(){
        Shape shape = new Circle();
        shape.setName("Circle A");
        shape.setFont("red", 3);
        shape.addSubShape(new Triangle());
        JacksonTest jacksonTest = new JacksonTest();
        jacksonTest.writeJSON(shape);
    }
}
