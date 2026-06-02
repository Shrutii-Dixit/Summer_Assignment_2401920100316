/*
LeetCode Problem: Two Sum (#1)
Language: Java
Week: 1
Day: 1

Approach:
Use a HashMap to store previously visited numbers and their indices.
For every element, check whether its complement (target - current number)
already exists in the map. If found, return both indices.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashMap;

class Solution {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int n = nums.length;

		for (int i = 0; i < n; i++) {
			int temp = target - nums[i];

			// If the complement has already been seen, return both indices.
			if (map.containsKey(temp)) {
				return new int[]{map.get(temp), i};
			}

			// Store the current number with its index for future lookups.
			map.put(nums[i], i);
		}

		return new int[]{};
	}
}
