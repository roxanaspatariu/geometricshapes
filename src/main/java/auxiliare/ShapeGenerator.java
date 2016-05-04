package auxiliare;

import factory.ShapeFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V3790147 on 5/4/2016.
 */
public class ShapeGenerator {

    private int random;
    ShapeFactory shapeFactory;
    List<Shape> shapes;

    public ShapeGenerator(){
        shapeFactory = new ShapeFactory();
    }

    public List<Shape> generateListShape() {
        random = (int) (Math.random() * Forms.values().length + 1);
        shapes = new ArrayList<Shape>();
        while(random!=0) {
            shapes.add(shapeFactory.getShape(Forms.randomForm().toString()));
            random-- ;
        }
        return shapes;
    }

    public Shape generateShape(){
        return shapeFactory.getShape(Forms.randomForm().toString());
    }

}
