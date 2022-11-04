package hw12.Task_1;

public class SecondThread implements Runnable{
    private FirstThread firstThread;

    @Override
    public void run() {
        Thread fiveSecondThread = Thread.currentThread();
        while (!fiveSecondThread.isInterrupted()) {
            if (fiveSecondPause()) {
                System.out.println("Five seconds passed");
            }
        }
    }
        private synchronized boolean fiveSecondPause(){
            for (int i = 0; i < 5; i++) {
                try {
                    wait(1000);
                } catch (InterruptedException e) {
                    return false;
                }
            }
            notify();
            return true;
        }
    }

