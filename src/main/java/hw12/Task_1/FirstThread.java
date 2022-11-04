package hw12.Task_1;

public class FirstThread implements Runnable{
    private int time = 0;

    @Override
    public void run() {
        Thread oneSecondTreader = Thread.currentThread();
        while (!oneSecondTreader.isInterrupted()) {
            if (oneSecondPassed()) {
                time++;
                System.out.println("Time passed: " + time);
            }
        }
    }
    private synchronized boolean oneSecondPassed(){
        boolean oneSecondPassed = false;
        try {
            wait(1000);
        } catch (InterruptedException e) {
            return false;
        }
        notify();
        return true;
    }
}
