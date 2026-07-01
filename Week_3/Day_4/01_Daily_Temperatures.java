/*
LeetCode Problem: Daily Temperatures (#739)
Language: Java
Week: 3
Day: 4

Approach:
Use a Monotonic Decreasing Stack to store indices of days whose next
warmer temperature has not yet been found.

While traversing the array:
- If the current temperature is greater than the temperature at the index
  stored on the stack top, then the current day is the answer for that index.
- Store the difference of indices as the number of waiting days.
- Use the input array itself to store answers, avoiding an extra result array.

After traversal, all remaining indices in the stack have no warmer day,
so their answer is 0.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int n = temperatures.length;

        // Store indices until a warmer temperature is found for them.
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty()
                    && temperatures[stack.peek()] < temperatures[i]) {
                int previousDay = stack.pop();
                temperatures[previousDay] = i - previousDay;
            }

            stack.push(i);
        }

        // Remaining days do not have any warmer future day.
        while (!stack.isEmpty()) {
            temperatures[stack.pop()] = 0;
        }

        return temperatures;
    }
}
