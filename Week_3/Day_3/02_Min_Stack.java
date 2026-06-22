/*
LeetCode Problem: Min Stack (#155)
Language: Java
Week: 3
Day: 3

Approach:
Use two stacks.

1. Main Stack:
   Stores all elements.

2. Min Stack:
   Stores the minimum elements seen so far.

When pushing:
- Push the value into the main stack.
- Push it into the min stack if it is smaller than or equal to the current minimum.

When popping:
- If the element being removed is the current minimum,
  remove it from the min stack as well.

This allows retrieving the minimum element in O(1) time.

Time Complexity:
push()  -> O(1)
pop()   -> O(1)
top()   -> O(1)
getMin()-> O(1)

Space Complexity: O(n)
*/

import java.util.Stack;

class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        // Store every value in the main stack.
        stack.push(val);

        // Track the minimum value seen so far, including duplicates.
        if (minStack.isEmpty() || minStack.peek() >= val) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }

        // Keep both stacks in sync when the current minimum is removed.
        if (minStack.peek().equals(stack.peek())) {
            minStack.pop();
        }

        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
