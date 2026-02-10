package solution;

public class MinStackExample {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(1);
        minStack.push(2);
        minStack.push(10);
        minStack.push(0);
        minStack.push(3);
        System.out.println("Top of the stack after pushing elements 5, 1, 2, 10, 0, 3: " + minStack.top());
        System.out.println("The smallest element: " + minStack.getMin());
        minStack.pop();
        System.out.println("Popped one element");
        System.out.println("Top of the stack: " + minStack.top());
        System.out.println("The smallest element: " + minStack.getMin());
        minStack.pop();
        System.out.println("Popped one element");
        System.out.println("Top of the stack: " + minStack.top());
        System.out.println("The smallest element: " + minStack.getMin());
    }
}
