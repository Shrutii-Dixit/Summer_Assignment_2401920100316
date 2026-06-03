/*
LeetCode Problem: Maximum Average Subarray I (#643)
Language: Java
Week: 1
Day: 2

Approach:
Use the Sliding Window technique.
First calculate the sum of the initial window of size k.
Then slide the window one position at a time by adding the new element
and removing the outgoing element.
Track the maximum window sum and return its average.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
	public double findMaxAverage(int[] nums, int k) {
		int left = 0;
		int right = k;

		int maxSum = 0;

		for (int index = 0; index < k; index++) {
			maxSum += nums[index];
		}

		int currentSum = maxSum;

		while (right < nums.length) {
			// Slide the window by adding the incoming element and removing the outgoing one.
			currentSum = currentSum + nums[right] - nums[left];

			left++;
			right++;

			// Keep track of the largest window sum seen so far.
			maxSum = Math.max(maxSum, currentSum);
		}

		return (double) maxSum / k;
	}
}
