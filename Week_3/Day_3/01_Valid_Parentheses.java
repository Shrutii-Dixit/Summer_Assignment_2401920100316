/*
LeetCode Problem: Valid Parentheses (#20)
Language: Java
Week: 3
Day: 3

Approach:
Use a stack to keep track of opening brackets.
Whenever an opening bracket is encountered, push it onto the stack.
For a closing bracket, check whether the stack is empty.
If not, compare the top element with the corresponding opening bracket.
If they match, pop the stack; otherwise return false.
At the end, the stack must be empty for the string to be valid.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            // Push every opening bracket onto the stack.
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }else {
                // A closing bracket cannot be valid without a matching opener.
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.peek();

                // Check whether the current closing bracket matches the stack top.
                if ((ch == ')' && top == '(')
                        || (ch == '}' && top == '{')
                        || (ch == ']' && top == '[')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        // All opening brackets must be matched and removed.
        return st.isEmpty();
    }
}
