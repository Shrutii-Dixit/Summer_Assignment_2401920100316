/*
LeetCode Problem: Next Greater Element I (#496)
Language: Java
Week: 3
Day: 3

Approach:
Use a Monotonic Decreasing Stack.

Traverse nums2:
- While the current element is greater than the stack top,
  the current element becomes the next greater element of the stack top.
- Store this mapping in a HashMap.

After traversal:
- Remaining elements in the stack do not have a next greater element,
  so map them to -1.

Finally, use the HashMap to replace each element in nums1
with its next greater element.

Time Complexity: O(n + m)
Space Complexity: O(n)
*/

import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> nextGreaterMap = new HashMap<>();

        int n = nums2.length;
        int m = nums1.length;

        // Build the next greater element mapping for every value in nums2.
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() < nums2[i]) {
                nextGreaterMap.put(stack.pop(), nums2[i]);
            }

            stack.push(nums2[i]);
        }

        // Values left in the stack have no greater element to their right.
        while (!stack.isEmpty()) {
            nextGreaterMap.put(stack.pop(), -1);
        }

        // Replace each nums1 value with its mapped next greater element.
        for (int j = 0; j < m; j++) {
            nums1[j] = nextGreaterMap.get(nums1[j]);
        }

        return nums1;
    }
}
