package Human;

import java.util.Objects;

public class Human {
    public static final int AMOUNT_OF_CHROMOSOME = 48;
    private String name;
    private int age;

    public Human() {
    }



    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
//        System.out.println("amountOfChromosome = " + AMOUNT_OF_CHROMOSOME);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printHumanInfo(){
        System.out.println("This is simple human with name = " + name);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return getAge() == human.getAge() && getName().equals(human.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}
