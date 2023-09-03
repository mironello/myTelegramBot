package diamond;

public interface B {
    default public void foo(){
        System.out.println("b foo");
    };
}
