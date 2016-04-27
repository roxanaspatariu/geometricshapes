package auxiliare;

/**
 * Created by v3790147 on 4/27/2016.
 */
public enum Forms {
    CUBE("Cube"),
    CIRCLE("Circle"),
    SQUARE("Square"),
    TRIANGLE("Triangle"),
    TRAPEZE("Trapeze");

    private final String stringValue;
    private Forms(final String s) { stringValue = s; }
}
