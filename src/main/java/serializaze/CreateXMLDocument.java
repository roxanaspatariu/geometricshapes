package serializaze;


import auxiliare.Shape;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

/**
 * Created by V3790147 on 5/5/2016.
 */
public class CreateXMLDocument {

    Document document;
    Element root;
    private static CreateXMLDocument createXMLDocument = new CreateXMLDocument();

    public static CreateXMLDocument getInstance(){
            return createXMLDocument;
    }

    private CreateXMLDocument(){
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


    public Element setSimpleNodeElement(Shape shape, Element shapeElement){

        Element nameElement = document.createElement("Name");
        nameElement.appendChild(document.createTextNode(shape.getName()));
        shapeElement.appendChild(nameElement);

        Element areaElement = document.createElement("Area");
        areaElement.appendChild(document.createTextNode(String.valueOf(shape.getArea())));
        shapeElement.appendChild(areaElement);

        Element dimensionElement = document.createElement("Dimension");
        dimensionElement.appendChild(document.createTextNode(String.valueOf(shape.getDimension())));
        shapeElement.appendChild(dimensionElement);

        Element font = document.createElement("Font");
        shapeElement.appendChild(font);

        Element colorElement = document.createElement("Color");
        colorElement.appendChild(document.createTextNode(shape.getFont().getColor()));
        font.appendChild(colorElement);

        Element borderElement = document.createElement("Border");
        borderElement.appendChild(document.createTextNode(String.valueOf(shape.getFont().getBorderSize())));
        font.appendChild(borderElement);

        Element subShapesElement = document.createElement("Subshapes");
        for(Shape shape1 :shape.getSubShapes()) {
            shapeElement.appendChild(setSimpleNodeElement(shape1, subShapesElement));
        }
        return shapeElement;
    }

    public void setElementValue(Shape shape){

        Element shapeElement = document.createElement("Shape");
        shapeElement.setAttribute("type", shape.getClass().getName());
        root.appendChild(shapeElement);
        setSimpleNodeElement(shape, shapeElement);
        create();
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
