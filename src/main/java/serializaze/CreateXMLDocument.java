package serializaze;


import auxiliare.Shape;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by V3790147 on 5/5/2016.
 */
public class CreateXMLDocument {

    static Document document;
    Element root;

    public CreateXMLDocument(){
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            document = documentBuilder.newDocument();
            root = document.createElement("Shapes");
            document.appendChild(root);
        } catch (ParserConfigurationException e){
            e.printStackTrace();
        }
    }

    public void setElementValue(String name, double area, int dimension, String colour, double borderSize ){

        Element shape = document.createElement("Shape");
        shape.setAttribute("type", shape.getClass().getName());
        shape.appendChild((document.createElement("Name"))).appendChild(document.createTextNode(name));
        shape.appendChild((document.createElement("Area"))).appendChild(document.createTextNode(String.valueOf(area)));
        shape.appendChild((document.createElement("Dimension"))).appendChild(document.createTextNode(String.valueOf(dimension)));
        Element font = document.createElement("Font");
        shape.appendChild(font);
        font.appendChild((document.createElement("Color"))).appendChild(document.createTextNode(colour));
        font.appendChild((document.createElement("Border"))).appendChild(document.createTextNode(String.valueOf(borderSize)));

    }


    public void create(){
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("shapesVisitor.xml"));
            transformer.transform(source, result);
        }catch (TransformerConfigurationException e){
            e.printStackTrace();
        }catch (TransformerException t){
            t.printStackTrace();
        }
    }

}
