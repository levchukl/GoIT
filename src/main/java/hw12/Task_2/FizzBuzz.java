package hw12.Task_2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.IntConsumer;

public class FizzBuzz {
    private final int n;
   private final BlockingQueue<Integer> fizzQueue = new LinkedBlockingQueue<>();
   private final BlockingQueue<Integer> buzzQueue = new LinkedBlockingQueue<>();
   private final BlockingQueue<Integer> fizzBuzzQueue = new LinkedBlockingQueue<>();
   private final BlockingQueue<Integer> numberQueue = new LinkedBlockingQueue<>();

   public FizzBuzz(int n) throws InterruptedException {
       this.n = n;
       numberQueue.put(1);
   }

   private void decineNextQueue(int i) throws InterruptedException {
       if (i > this.n){
           fizzQueue.put(0);
           buzzQueue.put(0);
           fizzBuzzQueue.put(0);
           numberQueue.put(0);
           return;
       }
       if (i % 15 == 0){
           fizzBuzzQueue.put(i);
       } else if (i % 3 == 0) {
           fizzQueue.put(i);
       } else if (i % 5 == 0) {
           buzzQueue.put(i);
       } else {
           numberQueue.put(i);
       }
   }
   public void fizz (Runnable printFizz) throws InterruptedException {
       for (;;){
           Integer output = this.fizzQueue.take();
           if (output.intValue() == 0){
               return;
           }
           printFizz.run();
           decineNextQueue(output + 1);
       }
   }
    public void buzz (Runnable printBuzz) throws InterruptedException {
        for (;;){
            Integer output = this.buzzQueue.take();
            if (output.intValue() == 0){
                return;
            }
            printBuzz.run();
            decineNextQueue(output + 1);
        }
    }
    public void fizzbuzz (Runnable printFizzBuzz) throws InterruptedException {
        for (;;){
            Integer output = this.fizzBuzzQueue.take();
            if (output.intValue() == 0){
                return;
            }
            printFizzBuzz.run();
            decineNextQueue(output + 1);
        }
    }
    public void number (IntConsumer printNumber) throws InterruptedException {
        for (;;){
            Integer output = this.numberQueue.take();
            if (output.intValue() == 0){
                return;
            }
            printNumber.accept(output);
            decineNextQueue(output + 1);
        }
    }
}
