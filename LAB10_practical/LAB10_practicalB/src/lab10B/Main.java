package lab10B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of messages: ");
        int numMessages = scanner.nextInt();
        BoundedBuffer buffer = new BoundedBuffer(10);
        Producer producer = new Producer(buffer, numMessages);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
        scanner.close();
    }
}
