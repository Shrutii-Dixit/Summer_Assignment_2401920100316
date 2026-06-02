/*
LeetCode Problem: Best Time to Buy and Sell Stock (#121)
Language: Java
Week: 1
Day: 1

Approach:
Traverse the array once while maintaining the minimum stock price seen so far.
For each day, calculate the profit that would be earned by selling on that day.
Update the maximum profit whenever a better profit is found.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
	public int maxProfit(int[] prices) {
		int mins = prices[0];
		int profit = 0;
		int n = prices.length;

		for (int i = 1; i < n; i++) {
			// Track the minimum buying price seen so far.
			mins = Math.min(mins, prices[i]);

			// Evaluate profit if we sell on the current day.
			profit = Math.max(profit, prices[i] - mins);
		}

		return profit;
	}
}
