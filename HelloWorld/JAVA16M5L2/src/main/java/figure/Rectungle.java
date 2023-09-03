package figure;

public class Rectungle extends Figure{
    private int firstSide;
    private int sevondSize;

    public Rectungle(int firstSide, int sevondSize) {
        this.firstSide = firstSide;
        this.sevondSize = sevondSize;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSevondSize() {
        return sevondSize;
    }

    @Override
    public double getSquare() {
        return firstSide*sevondSize;
    }
}
