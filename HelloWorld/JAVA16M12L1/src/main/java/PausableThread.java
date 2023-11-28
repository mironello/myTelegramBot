public class PausableThread extends Thread {

    private volatile boolean isAlive = true;
    private volatile boolean needToRun = false;




    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isNeedToRun() {
        return needToRun;
    }

    public void setNeedToRun(boolean needToRun) {
        this.needToRun = needToRun;
    }

    @Override
    public void run() {
        while (isAlive) {
            if (needToRun) {
                try {
                    Thread.sleep(500);
                    System.out.println("Running new thread");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        PausableThread pausableThread = new PausableThread();
        pausableThread.start();

        Thread.sleep(2000);

        pausableThread.setNeedToRun(true);

        Thread.sleep(2000);

        pausableThread.setNeedToRun(false);

        Thread.sleep(2000);

        pausableThread.setAlive(false);
    }
}
