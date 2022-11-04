package hw12.Task_1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
     Thread one = new Thread(new FirstThread());
     Thread two = new Thread(new SecondThread());
     one.start();
     two.start();
     try {
         Thread.sleep(1000);
     } catch (InterruptedException exception){
         exception.printStackTrace();
     }
     one.interrupt();
     two.interrupt();
    }
}
