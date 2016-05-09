package visitor;

import auxiliare.Shape;

import java.util.List;

/**
 * Created by V3790147 on 5/4/2016.
 */
public class Picture extends Shape implements PicturePart {

    public Picture() {

    }

    public Picture(Shape shape, List<Shape> shapes){
        super(shape);
        this.setSubShapes(shapes);
    }

    @Override
    public void accept(PicturePartVisitor visitor) {
        for(Shape shape : getSubShapes()){
            shape.accept(visitor);
        }

        visitor.visit(this);
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}
