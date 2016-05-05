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

    Document document;
    Element root;

    public CreateXMLDocument(){
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            document = documentBuilder.newDocument();
            root = document.createElement("SHAPES");
            document.appendChild(root);
        } catch (ParserConfigurationException e){
            e.printStackTrace();
        }
    }

    public void setElementValue(String name, double area, int dimension, String colour, double borderSize ){

        root.setAttribute("type", name);
        root.appendChild(createElement("Name", name));
        root.appendChild(createElement("Area", String.valueOf(area)));
        root.appendChild(createElement("Dimension", String.valueOf(dimension)));
        root.appendChild(document.createTextNode("Font"));
        root.appendChild(createElement("Colour", colour ));
        root.appendChild(createElement("BorderSize", String.valueOf(borderSize)));
        create();
    }

    private Element createElement(String name, String value ){
        Element element = document.createElement(name);
        element.appendChild(document.createTextNode(value));
        return element;
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
