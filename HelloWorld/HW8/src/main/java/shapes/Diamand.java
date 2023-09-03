package shapes;

public class Diamand extends Square{
    public Diamand(int x, int y, String color, int sideA, int sideB) {
        super(x, y, color, sideA, sideB);
    }

    @Override
    public String getName(){
        return "Diamand";
    }
}
