package serializers;

import auxiliare.Shape;
import auxiliare.ShapeGenerator;
import org.junit.Test;
import serializaze.ObjectToJSON;
import serializaze.ObjectToXml;
import twodimensionalforms.Circle;
import twodimensionalforms.Triangle;
import visitor.JSONSerializationVisitor;
import visitor.Picture;
import visitor.PicturePart;
import visitor.XMLSerializationVisitor;

import java.util.List;

/**
 * Created by V3790147 on 5/4/2016.
 */
public class XMLSerializeDeserializeTest {

    @Test
    public void serializeToXmlWithJAXB(){
        ShapeGenerator shapeGenerator = new ShapeGenerator();
        Shape shape = shapeGenerator.generateShape();
        List<Shape> shapeList = shapeGenerator.generateListShape();
        Picture picture = new Picture(shape, shapeList);
        ObjectToXml objectToXml = new ObjectToXml();
        objectToXml.marshall(picture);
    }

    @Test
    public void serializeToXmlWithVisitor(){
        ShapeGenerator shapeGenerator = new ShapeGenerator();
        Shape shape = shapeGenerator.generateShape();
        List<Shape> shapeList = shapeGenerator.generateListShape();
        PicturePart picture = new Picture(shape, shapeList);
        picture.accept(new XMLSerializationVisitor());
    }
}
