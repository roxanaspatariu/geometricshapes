package auxiliare;

/**
 * Created by V3790147 on 4/28/2016.
 */
public class Line implements Operations {
    private Point a;
    private Point b;
    private Font font;

    public Line (Point a, Point b){
        this.a = new Point(a.getX(), a.getY());
        this.b = new Point(b.getX(), b.getY());
    }

    @Override
    public void setFont(String color, double borderSize) {
        this.font.setColor(color);
        this.font.setBorderSize(borderSize);
    }

    @Override
    public void draw() {
        System.out.println("You're drawing a "+ font.getColor()+" line, with a width of "+ font.getBorderSize() + " cm");
    }
    @Override
    public String toString(){
        return "Line at (" + (int)a.getX()+","+(int)a.getY()+").";
    }
}
