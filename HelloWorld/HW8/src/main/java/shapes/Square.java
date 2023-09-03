package shapes;

public class Square extends Shape{

    private int sideA;
    private int sideB;

    public Square(int x, int y, String color, int sideA, int sideB) {
        super(x, y, color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String getName() {
        return "square";
    }
}
