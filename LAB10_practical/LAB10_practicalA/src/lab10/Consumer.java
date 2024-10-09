package lab10;

public class Consumer {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void consume() {
        while (true) {
            try {
                String message = buffer.take();
                if (message.equals("STOP")) {
                    break;
                }
                System.out.println("Consumed: " + message);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void start() {
        new Thread(this::consume).start();
    }
}