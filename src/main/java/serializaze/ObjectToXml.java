package serializaze;

import auxiliare.Shape;
import sun.security.provider.SHA;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by V3790147 on 5/5/2016.
 */
public class ObjectToXml {

    public void marshall(Shape shape, String fileName){
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Shape.class);
            Marshaller jaxMarshaller = jaxbContext.createMarshaller();
            jaxMarshaller.marshal(shape, new File(fileName));
            jaxMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            jaxMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public Shape unmarshall(String fileName){
        Shape shape = null;
        try {
            File file = new File(fileName);
            JAXBContext jaxbContext = JAXBContext.newInstance(Shape.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            shape = (Shape) jaxbUnmarshaller.unmarshal(file);

        }catch (JAXBException e){
            e.printStackTrace();
        }
        return shape;
    }
}
