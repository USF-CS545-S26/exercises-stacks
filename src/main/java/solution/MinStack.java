package solution;

import stack.ArrayStack;
import stack.Stack;

/** Use two stacks to maintain a "min stack"
 * where we can push and pop elements in constant time,
 * but also get the minimum element and check the "top" in constant time.
 */
class MinStack {
    private Stack stack1; // where you will push each element normally
    private Stack stack2; // "min stack" - what exactly will it store?

    public MinStack() {
        stack1 = new ArrayStack();
        stack2 = new ArrayStack();
    }

    /**
     * Push an element val
     * @param val
     */
    public void push(int val) {
        // Push val onto stack1 which contains all elements
        stack1.push(val);
        // push the smallest between val and top of stack2 onto stack 2
        if (stack2.empty() || stack2.peek() > val)
            stack2.push(val);
        else
            stack2.push(stack2.peek());
    }

    /**
     * Pop an element on top of the "min stack"
     * Will you pop from both stacks?
     */
    public void pop() {
        stack1.pop();
        stack2.pop();

    }

    /**
     * Return the top of stack 1 without removing it
     * @return element at the top of stack 1
     */
    public int top() {
        if (stack1.empty())
            throw new IllegalArgumentException();
        return stack1.peek();
    }

    /**
     * Returns the smallest element without removing it
     * (it is stored in stack 2)
     * @return
     */
    public int getMin() {
        if (stack2.empty())
            throw new IllegalArgumentException();
        return stack2.peek();

    }
}