/*
LeetCode Problem: Evaluate Reverse Polish Notation (#150)
Language: Java
Week: 3
Day: 4

Approach:
Use a stack to evaluate the expression.

For each token:
- If it is a number, push it onto the stack.
- If it is an operator, pop the top two elements,
  perform the operation, and push the result back.

Important:
For subtraction and division, maintain the correct order:
b operator a

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int n = tokens.length;

        for (int i = 0; i < n; i++) {
            String ch = tokens[i];

            if (ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")) {
                // Pop the operands in reverse order of evaluation.
                int a = st.pop();
                int b = st.pop();

                switch (ch) {
                    case "+":
                        st.push(a + b);
                        break;

                    case "-":
                        st.push(b - a);
                        break;

                    case "*":
                        st.push(a * b);
                        break;

                    case "/":
                        st.push(b / a);
                        break;
                }
            } else {
                // Push numeric tokens directly onto the stack.
                st.push(Integer.parseInt(ch));
            }
        }

        return st.pop();
    }
}
