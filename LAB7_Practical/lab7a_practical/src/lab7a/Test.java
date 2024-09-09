package lab7a;

public class Test {
    public static void main(String[] args) {
        // Test with integers
        Stack<Integer> intStack = new LinkedListStack<>();
        intStack.push(1);
        intStack.push(2);
        System.out.println(intStack.peek()); 
        System.out.println(intStack.pop()); 
        System.out.println(intStack.isEmpty());

        // Test with strings
        Stack<String> stringStack = new ArrayStack<>(10);
        stringStack.push("hello");
        stringStack.push("world");
        System.out.println(stringStack.peek()); 
        System.out.println(stringStack.pop()); 
        System.out.println(stringStack.isEmpty()); 
    }
}