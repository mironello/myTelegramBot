public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Thread thread = Thread.currentThread();
        System.out.println("thread.getName() = " + thread.getName());
    }
}
