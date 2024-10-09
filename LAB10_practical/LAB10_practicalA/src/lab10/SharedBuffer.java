package lab10;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class SharedBuffer {
    private BlockingQueue<String> buffer;

    public SharedBuffer() {
        this.buffer = new LinkedBlockingQueue<>();
    }

    public void put(String message) throws InterruptedException {
        buffer.put(message);
    }

    public String take() throws InterruptedException {
        return buffer.take();
    }
}