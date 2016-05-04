package exceptions;

/**
 * Created by V3790147 on 5/4/2016.
 */
public class NegativeValuesException extends IllegalArgumentException{

    public NegativeValuesException(){
        super("You've entered a negative exception!");
    }
}
