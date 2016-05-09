package auxiliare;

import exceptions.NegativeValuesException;

import java.io.Serializable;

/**
 * Created by Roxana on 4/25/2016.
 */
public class Font implements Serializable {
    private String colour;
    private double borderSize;

    public Font() {
        colour = "black";
        borderSize = 1;
    }

    public Font(String colour) {
        this.colour = colour;
    }

    public Font(String colour, double borderSize) {
        this.colour = colour;
        if(borderSize<0){
            try {
                throw new NegativeValuesException();
            } catch (NegativeValuesException e) {
                e.printStackTrace();
                this.borderSize = Math.abs(borderSize);
            }
        } else {
            this.borderSize = borderSize;
        }
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
