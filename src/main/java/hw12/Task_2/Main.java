package hw12.Task_2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        FizzBuzz fizzBuzz = new FizzBuzz(50);

        new Thread(() -> {
            try {
                fizzBuzz.fizz(() -> System.out.println("fizz "));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> {
            try {
                fizzBuzz.buzz(() -> System.out.println("buzz "));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> {
            try {
                fizzBuzz.fizzbuzz(() -> System.out.println("fizzbuzz "));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> {
            try {
                fizzBuzz.number(x -> System.out.println(x + " "));

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}