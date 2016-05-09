package serializaze;

import auxiliare.Shape;

import java.io.*;

/**
 * Created by V3790147 on 5/9/2016.
 */
public class ObjectToTxt {

    public void serializeToTxt(Shape shape, String fileName){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
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
            ObjectInputStream in = new ObjectInputStream(fileInputStream);
            shape = (Shape)in.readObject();
            in.close();
            fileInputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return shape;
    }
}
