package lab9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NumberPrinter {

    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();
        printer.execute();
    }

    public void execute() {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 15; i++) {
            final int number = i;
            executor.submit(() -> processNumber(number));
        }
        executor.shutdown();
    }

    public void processNumber(int number) {

        if (number % 2 == 0 && number % 3 != 0 && number % 4 != 0 && number % 5 != 0) {
            System.out.println("Number " + number + " is divisible by 2");
        }
         else if (number % 3 == 0 && number % 2 != 0 && number % 4 != 0 && number % 5 != 0) {
            System.out.println("Number " + number + " is divisible by 3");
        }
         else if (number % 4 == 0 && number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
            System.out.println("Number " + number + " is divisible by 4");
        } 
         else if (number % 5 == 0 && number % 2 != 0 && number % 3 != 0 && number % 4 != 0) {
            System.out.println("Number " + number + " is divisible by 5");
        } 
         else {
            System.out.println("Number " + number);
        }
    }
}
