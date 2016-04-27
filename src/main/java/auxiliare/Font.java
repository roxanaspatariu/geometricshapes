package auxiliare;

/**
 * Created by Roxana on 4/25/2016.
 */
public class Font {
    private String colour;
    private double borderSize;

    public Font(){
        colour = "black";
        borderSize = 1;
    }

    public Font(String colour){
        this.colour = colour;
    }

    public  Font(String colour, double borderSize){
        this.colour = colour;
        this.borderSize = borderSize;
    }

    public String getColor() {
        return colour;
    }

    public void setColor(String color) {
        this.colour = color;
    }

    public double getBorderSize() {
        return borderSize;
    }

    public void setBorderSize(double borderSize) {
        this.borderSize = borderSize;
    }


}
