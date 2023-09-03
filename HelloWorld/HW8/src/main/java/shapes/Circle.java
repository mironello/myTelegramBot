package shapes;

public class Circle extends Shape implements Drawable{
    private int radius;

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }


    @Override
    public String getName() {
        return "curcle";
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}
