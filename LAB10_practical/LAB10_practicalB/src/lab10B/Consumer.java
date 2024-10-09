package lab10B;

public class Consumer {
    private BoundedBuffer buffer;

    public Consumer(BoundedBuffer buffer) {
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