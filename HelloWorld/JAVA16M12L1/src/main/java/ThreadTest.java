public class ThreadTest {

    public static void main(String[] args) throws InterruptedException{
        Thread endlessThread = new Thread(){
            @Override
            public void run(){
                while(!isInterrupted()){
                    System.out.println("Running ...");
                }
            }
        };
        endlessThread.start();
        Thread.sleep(2000);
        endlessThread.interrupt();
    }
}
