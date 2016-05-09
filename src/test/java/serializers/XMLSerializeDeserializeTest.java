package serializers;

import auxiliare.Shape;
import auxiliare.ShapeGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import serializaze.CreateXMLDocument;
import serializaze.ObjectToJSON;
import serializaze.ObjectToXml;
import threedimensionalforms.Cube;
import twodimensionalforms.Circle;
import twodimensionalforms.Triangle;
import visitor.*;

import java.util.List;

/**
 * Created by V3790147 on 5/4/2016.
 */
public class XMLSerializeDeserializeTest {

    @Test
    public void testSerializeToXmlWithJAXB(){
        ShapeGenerator shapeGenerator = new ShapeGenerator();
        Shape shape = shapeGenerator.generateShape();
        List<Shape> shapeList = shapeGenerator.generateListShape();
        Picture picture = new Picture(shape, shapeList);
        ObjectToXml objectToXml = new ObjectToXml();
       // objectToXml.marshall(picture, "shapesJAXB.xml");
        objectToXml.marshall(shape, "shapeJAXB.xml");
    }

    @Test
    public void testDeserializeXmlWithJAXB(){
        ObjectToXml objectToXml = new ObjectToXml();
        Cube shape = (Cube) objectToXml.unmarshall("shapeJAXB.xml");
        Assert.assertNotNull(shape);
    }

    @Test
    public void testSerializeToXmlWithVisitor(){
        ShapeGenerator shapeGenerator = new ShapeGenerator();
        Shape shape = shapeGenerator.generateShape();

        List<Shape> shapeList = shapeGenerator.generateListShape();
        PicturePart picture = new Picture(shape, shapeList);
        PicturePartVisitor visitor = new XMLSerializationVisitor();
        picture.accept(visitor);

    }

    @Test
    public void checkSingleton(){
        Assert.assertEquals(CreateXMLDocument.getInstance(), CreateXMLDocument.getInstance());
    }
}
