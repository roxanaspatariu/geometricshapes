package threedimensionalforms;

import auxiliare.Font;
import auxiliare.Forms;
import auxiliare.Vector;
import visitor.PicturePartVisitor;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Roxana on 4/25/2016.
 */
@XmlRootElement
public class Cube extends Polyhedron {

    private Vector a;
    private Vector b;
    private Vector c;
    private Vector d;
    private Vector e;
    private Vector f;
    private Vector g;
    private Vector h;
    private double sideLength;
    private Font font;


    public Cube() {
        this.setName(Forms.CUBE.name());
        this.a = new Vector(0, 0, 0);
        this.b = new Vector(1, 0, 0);
        this.c = new Vector(1, 0, 1);
        this.d = new Vector(0, 0, 1);
        this.e = new Vector(0, 1, 0);
        this.f = new Vector(1, 1, 0);
        this.g = new Vector(1, 0, 1);
        this.h = new Vector(0, 1, 1);
    }

    public Cube(Vector a, Vector b, Vector c) {
        this.setName(Forms.CUBE.name());
        sideLength = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new Vector(a.getX(), a.getY(), c.getZ());
        this.e = new Vector(a.getX(), a.getY() + sideLength, a.getZ());
        this.f = new Vector(b.getX(), b.getY() + sideLength, b.getZ());
        this.g = new Vector(c.getX(), c.getY() + sideLength, c.getZ());
        this.h = new Vector(d.getX(), d.getY() + sideLength, d.getZ());
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideLength, 3);
    }

    @Override
    public String toString() {
        return "Cube at coordinates a(" + (int) a.getX() + "," +
                (int) a.getY() + "," + (int) a.getZ() + "), b(" + (int) b.getX() + "," + (int) b.getY() + "," + (int) b.getZ() + "), c(" + (int) c.getX() + "," + (int) c.getY() + "," + (int) c.getZ() + "), d(" +
                +(int) d.getX() + "," + (int) d.getY() + "," + (int) d.getZ() + "), e(" + (int) e.getX() + "," + (int) e.getY() + "," + (int) e.getZ() + "), f(" + (int) f.getX() + "," + (int) f.getY() + "," + (int) f.getZ() + "), g(" +
                +(int) g.getX() + "," + (int) g.getY() + "," + (int) g.getZ() + "), h(" + (int) h.getX() + "," + (int) h.getY() + "," + (int) h.getZ() + ").";
    }

    @Override
    public void draw() {
        System.out.println("You're drawing a " + getFont().getColor() + " " + getName() + " with a border of " + getFont().getBorderSize() + " cm, at a(" +
                +(int) a.getX() + "," + (int) a.getY() + "," + (int) a.getZ() + "), b(" + (int) b.getX() + "," + (int) b.getY() + "," + (int) b.getZ() +
                "), c(" + (int) c.getX() + "," + (int) c.getY() + "," + (int) c.getZ() + "), d(" + (int) d.getX() + "," + (int) d.getY() + "," + (int) d.getZ()
                + "), e(" + (int) e.getX() + "," + (int) e.getY() + "," + (int) e.getZ() + "), f(" + (int) f.getX() + "," + (int) f.getY() + "," + (int) f.getZ() + "), g(" +
                +(int) g.getX() + "," + (int) g.getY() + "," + (int) g.getZ() + "), h(" + (int) h.getX() + "," + (int) h.getY() + "," + (int) h.getZ() + ").");
    }

    @Override
    public void accept(PicturePartVisitor visitor) {
        visitor.visit(this);
    }
}
