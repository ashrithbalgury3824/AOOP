package lab7a;

public class LinkedListStack<T> implements Stack<T> {
    private Node<T> top;
    private int size;

    private static class Node<T> {
        T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;
        }
    }

    @Override
    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = top;
        top = newNode;
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T element = top.element;
        top = top.next;
        size--;
        return element;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.element;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}