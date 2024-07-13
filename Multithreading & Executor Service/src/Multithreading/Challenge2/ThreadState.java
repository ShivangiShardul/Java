package Multithreading.Challenge2;

public class ThreadState extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.printf("From inside run %s\n",getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
