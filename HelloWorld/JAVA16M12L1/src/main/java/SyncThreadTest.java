import java.util.ArrayList;
import java.util.List;

public class SyncThreadTest {

    private volatile static int counter = 0;

    public synchronized static void increment(){
        counter++;
    }

    private static void counterFirstRealization() throws InterruptedException {

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter = counter + 1;
                }
            });
            threads.add(thread);
        }
        for(Thread t: threads){
            t.start();
        }
        for(Thread t: threads){
            t.join();
        }
        System.out.println(counter);
    }

    private static void counterSecondRealization() throws InterruptedException {

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    synchronized (SyncThreadTest.class) {
                        counter = counter + 1;
                    }
                }
            });
            threads.add(thread);
        }
        for(Thread t: threads){
            t.start();
        }
        for(Thread t: threads){
            t.join();
        }
        System.out.println(counter);
    }

    private static void counterThirdRealization() throws InterruptedException {

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    increment();
                }
            });
            threads.add(thread);
        }
        for(Thread t: threads){
            t.start();
        }
        for(Thread t: threads){
            t.join();
        }
        System.out.println(counter);
    }

    public static void main(String[] args) throws InterruptedException {
//        counterFirstRealization();
//        counterSecondRealization();
        counterThirdRealization();
    }


}
