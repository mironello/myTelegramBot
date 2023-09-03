package figure;

import java.util.Objects;

public class Quad extends Figure{
    private int sideSize;

    public Quad(){}
    public Quad(int sideSize){
        this.sideSize=sideSize;
    }

    public int getSideSize() {
        return sideSize;
    }

    @Override
    public double getSquare() {
        return Math.pow(sideSize, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Quad)) return false;
        Quad quad = (Quad) o;
        return getSideSize() == quad.getSideSize();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSideSize());
    }
}
