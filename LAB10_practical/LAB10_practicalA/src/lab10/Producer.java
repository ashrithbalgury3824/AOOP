package lab10;

import java.util.*;

public class Producer {
    private SharedBuffer buffer;
    private int numMessages;
    Scanner scanner = new Scanner(System.in);

    public Producer(SharedBuffer buffer, int numMessages) {
        this.buffer = buffer;
        this.numMessages = numMessages;
    }

    public void produce() {
        for (int i = 0; i < numMessages; i++) {
            System.out.print("Enter message " + (i + 1) + ": ");
            String message = scanner.nextLine();
            try {
                buffer.put(message);
                System.out.println("Produced: " + message);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        try {
            buffer.put("STOP"); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        scanner.close();
    }

    public void start() {
        new Thread(this::produce).start();
    }
}