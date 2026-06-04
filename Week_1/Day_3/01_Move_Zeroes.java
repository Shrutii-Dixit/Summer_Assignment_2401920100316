/*
LeetCode Problem: Move Zeroes (#283)
Language: Java
Week: 1
Day: 3

Approach:
Use a two-pointer approach.
Pointer j keeps track of the position where the next non-zero element
should be placed. First move all non-zero elements to the front while
maintaining their relative order. Then fill the remaining positions with zeros.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
	/**
	 * Moves all zeros in the array to the end while preserving the order
	 * of non-zero elements. This implementation uses a two-pointer
	 * strategy and operates in-place.
	 *
	 * @param nums input array of integers
	 */
	public void moveZeroes(int[] nums) {
		// `j` is the index where the next non-zero element should be placed.
		int j = 0;

		// Iterate through the array and copy non-zero elements forward.
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[j++] = nums[i];
			}
		}

		// After all non-zero elements have been moved, fill the rest with zeros.
		while (j < nums.length) {
			nums[j++] = 0;
		}
	}
}

public class 01_Move_Zeroes {
    
}
