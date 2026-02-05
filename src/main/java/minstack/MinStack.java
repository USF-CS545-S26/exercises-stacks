package minstack;

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
        // FILL IN CODE: must run in constant time
        // Push val onto stack1 which contains all elements
        stack1.push(val);
        // Think of what to push into stack2



    }

    /**
     * Pop an element on top of the "min stack"
     * Will you pop from both stacks?
     */
    public void pop() {
        // FILL IN CODE: must run in constant time


    }

    /**
     * Return the top of stack 1 without removing it
     * @return element at the top of stack 1
     */
    public int top() {
        // FILL IN CODE

        return -1; // change
    }

    /**
     * Returns the smallest element without removing it
     * (it is stored in stack 2)
     * @return
     */
    public int getMin() {
        // FILL IN CODE:

        return -1; // change

    }
}