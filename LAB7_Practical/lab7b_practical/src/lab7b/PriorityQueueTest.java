package lab7b;

public class PriorityQueueTest {

    public static void main(String[] args) {
        PriorityQueue<Integer> intQueue = new PriorityQueue<>(5);
        intQueue.add(10);
        intQueue.add(5);
        intQueue.add(20);
        intQueue.add(3);
        System.out.println("Integer Priority Queue:");
        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.remove());
        }

        PriorityQueue<Double> doubleQueue = new PriorityQueue<>(5);
        doubleQueue.add(10.5);
        doubleQueue.add(5.2);
        doubleQueue.add(20.8);
        doubleQueue.add(3.1);
        System.out.println("Double Priority Queue:");
        while (!doubleQueue.isEmpty()) {
            System.out.println(doubleQueue.remove());
        }

        PriorityQueue<String> stringQueue = new PriorityQueue<>(5);
        stringQueue.add("apple");
        stringQueue.add("banana");
        stringQueue.add("cherry");
        stringQueue.add("date");
        System.out.println("String Priority Queue:");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.remove());
        }
    }
}
