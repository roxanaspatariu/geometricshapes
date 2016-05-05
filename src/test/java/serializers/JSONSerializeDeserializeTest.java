package serializers;

import auxiliare.Shape;
import auxiliare.ShapeGenerator;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;
import serializaze.ObjectToJSON;
import threedimensionalforms.Cube;
import visitor.Picture;
import visitor.PicturePart;
import visitor.JSONSerializationVisitor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Created by V3790147 on 5/4/2016.
 */
public class JSONSerializeDeserializeTest {

    @Test
    public void testPicture(){
        ShapeGenerator shapeGenerator = new ShapeGenerator();
        Shape shape = shapeGenerator.generateShape();
        List<Shape> shapeList = shapeGenerator.generateListShape();
        Picture picture = new Picture(shape, shapeList);
        Assert.assertEquals(picture.getName(), shape.getName());
    }


    @Test
    public void testSerialization(){
        ShapeGenerator shapeGenerator = new ShapeGenerator();
        Shape shape = shapeGenerator.generateShape();
        List<Shape> shapeList = shapeGenerator.generateListShape();
        PicturePart picture = new Picture(shape, shapeList);
        picture.accept(new JSONSerializationVisitor());
    }

    @Test
    public void testDeserialization(){
        ObjectMapper mapper = new ObjectMapper();
        ObjectToJSON objectToJSON = new ObjectToJSON();
        String fileString = null;
        try {
            fileString = objectToJSON.convertFileToString("shapes.json");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Shape shape = null;
        try {
            shape = mapper.readValue(fileString, Shape.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertNotNull(shape);
    }

}
