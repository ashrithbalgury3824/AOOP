package lab10B;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.LinkedList;

public class BoundedBuffer {
    private LinkedList<String> buffer;
    private int capacity;
    private Lock lock;
    private Condition notFull;
    private Condition notEmpty;

    public BoundedBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new LinkedList<>();
        this.lock = new ReentrantLock();
        this.notFull = lock.newCondition();
        this.notEmpty = lock.newCondition();
    }

    public void put(String message) throws InterruptedException {
        lock.lock();
        try {
            while (buffer.size() == capacity) {
                notFull.await();
            }
            buffer.add(message);
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public String take() throws InterruptedException {
        lock.lock();
        try {
            while (buffer.size() == 0) {
                notEmpty.await();
            }
            String message = buffer.removeFirst();
            notFull.signal();
            return message;
        } finally {
            lock.unlock();
        }
    }
}