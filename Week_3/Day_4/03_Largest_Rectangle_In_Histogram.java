/*
LeetCode Problem: Largest Rectangle in Histogram (#84)
Language: Java
Week: 3
Day: 4

Approach:
Use a Monotonic Increasing Stack to find:

1. Previous Smaller Element (PSE)
2. Next Smaller Element (NSE)

For every bar:
width = NSE - PSE - 1
area = height × width

Calculate the maximum area among all bars.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Stack;

class Solution {
	public int largestRectangleArea(int[] heights) {
		int n = heights.length;

		int[] left = new int[n];
		int[] right = new int[n];

		Stack<Integer> st = new Stack<>();

		// Find the previous smaller element index for each bar.
		for (int i = 0; i < n; i++) {
			while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
				st.pop();
			}

			if (st.isEmpty()) {
				left[i] = -1;
			} else {
				left[i] = st.peek();
			}

			st.push(i);
		}

		st.clear();

		// Find the next smaller element index for each bar.
		for (int i = n - 1; i >= 0; i--) {
			while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
				st.pop();
			}

			if (st.isEmpty()) {
				right[i] = n;
			} else {
				right[i] = st.peek();
			}

			st.push(i);
		}

		int maxArea = 0;

		// Compute the area of the largest rectangle for each bar.
		for (int i = 0; i < n; i++) {
			int width = right[i] - left[i] - 1;
			int area = heights[i] * width;

			maxArea = Math.max(maxArea, area);
		}

		return maxArea;
	}
}
