/*
LeetCode Problem: Maximum Subarray (#53)
Language: Java
Week: 1
Day: 2

Approach:
Use Kadane's Algorithm.
Maintain the maximum subarray sum ending at the current index.
For each element, decide whether to extend the current subarray or start a new one.
Track the overall maximum sum throughout the traversal.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
	public int maxSubArray(int[] nums) {
		int maxSum = nums[0];
		int currentSum = nums[0];
		int length = nums.length;

		for (int i = 1; i < length; i++) {
			// Extend the current subarray or start fresh at the current element.
			currentSum = Math.max(currentSum + nums[i], nums[i]);

			// Update the best answer seen so far.
			maxSum = Math.max(maxSum, currentSum);
		}

		return maxSum;
	}
}
