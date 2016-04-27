package auxiliare;

import threedimensionalforms.Cube;
import twodimensionalforms.Circle;
import twodimensionalforms.Square;
import twodimensionalforms.Trapeze;
import twodimensionalforms.Triangle;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roxana on 4/25/2016.
 */
public class ShapeFactory {

    List<Circle> circles = new ArrayList<Circle>();
    List<Square> squares = new ArrayList<Square>();
    List<Shape> shapes = new ArrayList<Shape>();

    public List<Circle> getCircles() {
        return circles;
    }

    public void setCircles(ArrayList<Circle> circles) {
        this.circles = circles;
    }

    public List<Square> getSquares() {
        return squares;
    }

    public void setSquares(ArrayList<Square> squares) {
        this.squares = squares;
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public ShapeFactory(String shapeName){
        Forms shape = Forms.valueOf(shapeName);

        switch (shape){
            case CUBE:
                new Cube();
                break;
            case CIRCLE:
                new Circle();
                break;
            case SQUARE:
                new Circle();
                break;
            case TRIANGLE:
                new Triangle();
                break;
            case TRAPEZE:
                new Trapeze();
                break;
        }
    }

    public void showObjects(){
        for(int i=0;i<circles.size();i++){
            circles.get(i).toString();
        }
    }

    public static void main(String[] args){
        ShapeFactory s1 = new ShapeFactory("Circle");
        s1.getCircles().get(0).calculateArea();
        s1.getCircles().get(1).calculateArea();
        s1.getCircles().get(1).draw();

        //Shape shape = new Circle(5);
        //shape.setFont(new Font("red", 3));
        //shape.toString();

        s1.showObjects();


    }
}
