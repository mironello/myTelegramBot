package task2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FizzBuzz {

    private int n;

    private int currentNumber = 1;

    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public FizzBuzz(int n) {
        this.n = n;
    }

    public void fizz() {
        for (; ; ) {
            lock.lock();
            try {
                while (currentNumber <= n && (currentNumber % 3 != 0 || currentNumber % 5 == 0)) {
                    condition.await();
                }
                if (currentNumber > n) {
                    return;
                }
                System.out.println("fizz");
                currentNumber++;
                condition.signalAll();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }

        public void buzz() {
        for (;;) {
            lock.lock();
            try {
                while (currentNumber <= n && (currentNumber % 5 != 0 || currentNumber % 3 == 0)) {
                    condition.await();
                }

                if (currentNumber > n) {
                    return;
                }

                System.out.println("buzz");
                currentNumber++;
                condition.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

        public void fizzbuzz () {
            for (; ; ) {
                lock.lock();
                try {
                    while (currentNumber <= n && (currentNumber % 3 != 0 || currentNumber % 5 != 0)) {
                        condition.await();
                    }
                    if (currentNumber > n) {
                        return;
                    }
                    System.out.println("fizzbuzz");
                    currentNumber++;
                    condition.signalAll();

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    lock.unlock();
                }
            }
        }

        public void number () {
            for (; ; ) {
                lock.lock();
                try {
                    while (currentNumber <= n && (currentNumber % 3 == 0 || currentNumber % 5 == 0)) {
                        condition.await();
                    }
                    if (currentNumber > n) {
                        return;
                    }
                    System.out.println(currentNumber);
                    currentNumber++;
                    condition.signalAll();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    lock.unlock();
                }
            }
        }


        public static void main (String[]args) throws InterruptedException {
            FizzBuzz fizzBuzz = new FizzBuzz(15);

            Thread A = new Thread(fizzBuzz::fizz);
            Thread B = new Thread(fizzBuzz::buzz);
            Thread C = new Thread(fizzBuzz::fizzbuzz);
            Thread D = new Thread(fizzBuzz::number);

            A.start();
            B.start();
            C.start();
            D.start();

            A.join();
            B.join();
            C.join();
            D.join();
        }
    }
