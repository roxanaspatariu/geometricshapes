package serializaze;


import auxiliare.Shape;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roxana on 5/9/2016.
 */
public class XMLDocumentDeserializer {

    Document document;

    public XMLDocumentDeserializer(String fileName) {
        try {
            File file = new File(fileName);
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            document = documentBuilder.parse(file);

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException s) {
            s.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Shape deserialize() {
        Object object = null;
        try {
            Element rootElement = document.getDocumentElement();
            NodeList nodeList = rootElement.getChildNodes();
            List listOfChilds = new ArrayList<>();
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    String methodName = "";
                    NodeList nodeList1 = element.getChildNodes();
                    for(int j=0;j<nodeList1.getLength();j++) {
                        Node node1 = nodeList1.item(j);
                        if (node1.getNodeType() == Node.ELEMENT_NODE) {
                            Element element1 = (Element) node1;

                            if(element1.getTagName().equals("Type")) {
                                String className = element1.getTextContent();
                                Class classDefinition = Class.forName(className);
                                object = classDefinition.newInstance();
                            }

                            searchTag(element1, object);
                            if (element1.getTagName().equals("Subshapes")) {
                                NodeList nodeList3 = element1.getChildNodes();
                                methodName = "setSubShapes";
                                Method setSubshapesMethod = object.getClass().getMethod(methodName, java.util.List.class);
                                for (int l = 0; l < nodeList3.getLength(); l++) {
                                    Node node3 = nodeList3.item(l);
                                    if (node3.getNodeType() == Node.ELEMENT_NODE) {
                                        Element element3 = (Element) node3;

                                        if(element3.getTagName().equals("Type")) {
                                            String className = element3.getTextContent();
                                            Class classDefinition = Class.forName(className);
                                            Object child =classDefinition.newInstance();
                                            searchTag(element3, child);
                                            listOfChilds.add(child);
                                        }
                                    }
                                }
                                setSubshapesMethod.invoke(object, listOfChilds);
                            }
                        }
                    }
                }


            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return (Shape) object;
    }

    public void searchTag(Element element, Object object) {
        try {
            String methodName = "";
            switch (element.getTagName()) {
                case "Name":
                    methodName = "setName";
                    Method setNameMethod = object.getClass().getMethod(methodName, String.class);
                    setNameMethod.invoke(object, element.getTextContent());
                    break;
                case "Area":
                    methodName = "setArea";
                    Method setAreaMethod = object.getClass().getMethod(methodName, double.class);
                    setAreaMethod.invoke(object, Double.parseDouble(element.getTextContent()));
                    break;
                case "Dimension":
                    methodName = "setDimension";
                    Method setDimensionMethod = object.getClass().getMethod(methodName, int.class);
                    setDimensionMethod.invoke(object, Integer.parseInt(element.getTextContent()));
                    break;
                case "Font":
                    methodName = "setFont";
                    String color = null;
                    String border = null;
                    NodeList nodeList2 = element.getChildNodes();

                    for (int j = 0; j < nodeList2.getLength(); j++) {
                        Node node2 = nodeList2.item(j);
                        if(node2.getNodeType() == Node.ELEMENT_NODE) {
                            Element element2 = (Element) node2;
                            if (element2.getTagName().equals("Color")) {
                                color = element2.getTextContent();
                            } else {
                                border = element2.getTextContent();
                            }
                        }
                    }
                    Method setFontMethod = object.getClass().getMethod(methodName, String.class, double.class);
                    setFontMethod.invoke(object, color, Double.parseDouble(border));
                    break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
