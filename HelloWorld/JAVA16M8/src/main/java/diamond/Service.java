package diamond;

public class Service implements A,B{
    @Override
    public void foo() {
        System.out.println("service foo");
    }
    public static void main(String[] args) {
        Service s = new Service();
        A a =(A)s;
        s.foo();
        a.foo();
    }
}



