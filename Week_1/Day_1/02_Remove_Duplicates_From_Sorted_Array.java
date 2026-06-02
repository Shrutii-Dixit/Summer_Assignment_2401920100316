/*
LeetCode Problem: Remove Duplicates from Sorted Array (#26)
Language: Java
Week: 1
Day: 1

Approach:
Use the Two Pointer technique.
Pointer i keeps track of the last unique element, while pointer j traverses the array.
Whenever a new unique element is found, place it at the next position of i.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
	public int removeDuplicates(int[] nums) {
		int n = nums.length;
		int i = 0;

		// i marks the position of the last unique value found so far.
		for (int j = 1; j < n; j++) {
			// When the current value differs from the last unique value,
			// move it forward to the next unique slot.
			if (nums[i] != nums[j]) {
				nums[++i] = nums[j];
			}
		}

		// The number of unique elements is the index of the last unique value + 1.
		return i + 1;
	}
}
