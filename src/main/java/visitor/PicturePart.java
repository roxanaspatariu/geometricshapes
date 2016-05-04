package visitor;

import threedimensionalforms.Cube;
import twodimensionalforms.*;

/**
 * Created by V3790147 on 5/4/2016.
 */
public interface PicturePart {

    void accept(PicturePartVisitor visitor);

}
