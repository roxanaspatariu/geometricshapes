package serializaze;

import auxiliare.Shape;
import com.fasterxml.jackson.databind.ObjectMapper;
import sun.security.provider.SHA;

import java.io.File;
import java.io.IOException;

/**
 * Created by V3790147 on 5/4/2016.
 */
public class JacksonTest {

    public void writeJSON(Shape shape){
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File("shapes.json"), shape);
        } catch (IOException e) {
            e.printStackTrace();
        };
    }

    public void readJSON(Shape shape){
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readValue(new File("shapes.json"), Shape.class);
        } catch (IOException e) {
            e.printStackTrace();
        };
    }

}
