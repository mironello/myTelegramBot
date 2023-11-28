package task1;

import java.time.temporal.TemporalAccessor;

public class Task1 {
    private int timeCount;

    public void twoThreads() throws InterruptedException {
        Thread threadDisplayTime = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Time passed: " + timeCount);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                timeCount++;
            }
        });
        threadDisplayTime.start();


        Thread treadShomMessage = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(5000);
                    System.out.println("Минуло 5 секунд");

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        treadShomMessage.start();
    }


    public static void main(String[] args) throws InterruptedException {
        Task1 task1 = new Task1();
        task1.twoThreads();

    }
}
