package diamond;

public interface SomeI {
    public  void a();
    public  void b();
    public  void c();
    public  void d();

    default public void e(){
        System.out.println("todo");
    };
}
