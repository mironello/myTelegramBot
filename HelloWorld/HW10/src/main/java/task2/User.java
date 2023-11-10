package task2;

public class User {
    private String name;
    private int age;

    public void setProperty(String propertyName, String value){
        if("name".equals(propertyName)){
            this.name = value;
        } else if("age".equals(propertyName)){
            this.age = Integer.parseInt(value);
        }
    }

    public String getName() {
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
}
