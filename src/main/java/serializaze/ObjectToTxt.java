package serializaze;

import auxiliare.Shape;

import javax.xml.transform.stream.StreamResult;
import java.io.*;

/**
 * Created by V3790147 on 5/9/2016.
 */
public class ObjectToTxt {

    public void serializeToTxt(Shape shape, String fileName){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);
            ObjectOutputStream out = new ObjectOutputStream(bos);
            out.writeObject(shape);
            out.close();
            fileOutputStream.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public Shape deserializeToTxt(String fileName){
        Shape shape = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            BufferedInputStream bis = new BufferedInputStream(fileInputStream);
            ObjectInputStream in = new ObjectInputStream(bis);
            shape = (Shape)in.readObject();
            in.close();
            fileInputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return shape;
    }
}
