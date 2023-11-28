public class ThreadWaitTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            try {
                synchronized (Thread.currentThread()){
                    Thread.currentThread().wait();
                }
            } catch (InterruptedException e ){
                throw new RuntimeException(e);
            }
            System.out.println("aaa");
        });

        thread.start();
        Thread.sleep(4000);

        synchronized (thread){
            thread.notify();
        }
    }
}
