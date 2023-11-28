package stateless;

import java.util.ArrayList;
import java.util.List;

public class SyncTHreadObjectTest {
    private volatile int counter;

    public static void main(String[] args) throws InterruptedException {
        SyncTHreadObjectTest stot = new SyncTHreadObjectTest();

        List<Human> humans = new ArrayList<>();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {

            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
//                    stot.validate(humans.get(j));
                    synchronized (stot) {
                        stot.counter = stot.counter + 1;
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
        System.out.println(stot.counter);
    }
    private boolean validate(Human human){
        return true;
    }

}
