package lab7b;

import java.util.Arrays;

public class PriorityQueue<T extends Comparable<T>> {
    private T[] heap;
    private int size;

    @SuppressWarnings("unchecked")
    public PriorityQueue(int capacity) {
        heap = (T[]) new Comparable[capacity];
        size = 0;
    }

    public void add(T element) {
        if (size == heap.length) {
            resize();
        }
        heap[size] = element;
        heapifyUp(size);
        size++;
    }

    public T remove() {
        if (isEmpty()) {
            throw new RuntimeException("Priority queue is empty");
        }
        T min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return min;
    }

    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        if (index > 0 && heap[parentIndex].compareTo(heap[index]) > 0) {
            swap(parentIndex, index);
            heapifyUp(parentIndex);
        }
    }

    private void heapifyDown(int index) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int smallest = index;

        if (leftChildIndex < size && heap[leftChildIndex].compareTo(heap[smallest]) < 0) {
            smallest = leftChildIndex;
        }

        if (rightChildIndex < size && heap[rightChildIndex].compareTo(heap[smallest]) < 0) {
            smallest = rightChildIndex;
        }

        if (smallest != index) {
            swap(smallest, index);
            heapifyDown(smallest);
        }
    }

    private void swap(int i, int j) {
        T temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void resize() {
        heap = Arrays.copyOf(heap, heap.length * 2);
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
