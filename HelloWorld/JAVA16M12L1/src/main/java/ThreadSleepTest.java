public class ThreadSleepTest {
    public static void main(String[] args) {
        System.out.println("In main Thread");

//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("In child thread");
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });

    Thread thread = new Thread(() -> {
        System.out.println("In child thread");

        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });


        thread.start();
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("In main Thread");

    }
}
