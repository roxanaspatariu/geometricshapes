package serializaze;

import auxiliare.Shape;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by V3790147 on 5/4/2016.
 */
public class ObjectToJSON {

    ObjectMapper mapper = new ObjectMapper();

    public ObjectMapper getMapper() {
        return mapper;
    }

    public void writeJSON(Shape shape){
        try {
            mapper.writeValue(new File("shapes.json"), shape);
            mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        } catch (IOException e) {
            e.printStackTrace();
        };
    }

    public ObjectMapper readJSON(String fileName){
        try {
            mapper.readValue(new File(fileName), Shape.class);
        } catch (IOException e) {
            e.printStackTrace();
        };
        return null;
    }

    public String convertFileToString(String fileName) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }
}
