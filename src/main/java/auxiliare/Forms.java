package auxiliare;

import java.util.Random;

/**
 * Created by v3790147 on 4/27/2016.
 */
public enum Forms {
    CUBE("Cube"),
    CIRCLE("Circle"),
    SQUARE("Square"),
    RECTANGLE("Rectangle"),
    TRIANGLE("Triangle"),
    TRAPEZE("Trapeze");

    private final String stringValue;

    Forms(final String s) {
        stringValue = s;
    }

    public static final Forms[] VALUES = values();

    public static Forms randomForm(){
        return VALUES[(int) (Math.random() * VALUES.length)];
    }
}
