package twodimensionalforms;

import auxiliare.Composite;
import auxiliare.Forms;
import auxiliare.Shape;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by V3790147 on 4/28/2016.
 */
public class CompositeTest {

    @Test
    public void testComposite(){
        Composite composite = new Composite(new Circle());
        composite.addSubShape(new Circle());
        composite.addSubShape(new Rectangle());
        composite.toString();
        Assert.assertEquals(2, composite.getSubShapes().size());

    }
}

