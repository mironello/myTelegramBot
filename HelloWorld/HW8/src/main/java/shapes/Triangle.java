package shapes;

public class Triangle extends Shape{

    private int sideA;
    private int sideC;
    private int sideB;

    public Triangle(int x, int y, String color, int sideA, int sideC, int sideB) {
        super(x, y, color);
        this.sideA = sideA;
        this.sideC = sideC;
        this.sideB = sideB;
    }

    @Override
    public String getName() {
        return "triangle";
    }
}
