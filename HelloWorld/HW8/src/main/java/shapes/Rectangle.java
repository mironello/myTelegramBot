package shapes;

public class Rectangle extends Square{

    public Rectangle(int x, int y, String color, int sideA, int sideB) {
        super(x, y, color, sideA, sideB);
    }

    @Override
    public String getName() {
        return "rectangle";
    }
}
