package lab10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of messages: ");
        int numMessages = scanner.nextInt();
        SharedBuffer buffer = new SharedBuffer();
        Producer producer = new Producer(buffer, numMessages);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
        scanner.close();
    }

}