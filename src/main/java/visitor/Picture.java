package visitor;

import auxiliare.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V3790147 on 5/4/2016.
 */
public class Picture implements PicturePart {

    List<Shape> shapes;


    public Picture(List<Shape> shapes){
        this.shapes = new ArrayList<Shape>();
        this.shapes.addAll(shapes);
    }

    @Override
    public void accept(PicturePartVisitor visitor) {
        for(Shape shape : shapes){
            shape.accept(visitor);
        }

        //visitor.visit(this);
    }
}
