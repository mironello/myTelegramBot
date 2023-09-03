package Human;

import java.util.Objects;

public class Developer extends Human{
private String posotion;
public Developer(){

}

    public String getPosotion() {
        return posotion;
    }

    public void setPosotion(String posotion) {
        this.posotion = posotion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Developer)) return false;
        if (!super.equals(o)) return false;
        Developer developer = (Developer) o;
        return getPosotion().equals(developer.getPosotion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPosotion());
    }

    public Developer(String position){
    this.posotion=position;
}

    @Override
    public void printHumanInfo() {
        System.out.println("This is developer with position = "+posotion);
    }
}
