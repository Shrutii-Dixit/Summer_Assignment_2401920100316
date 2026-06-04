/*
LeetCode Problem: Squares of a Sorted Array (#977)
Language: Java
Week: 1
Day: 3

Approach:
Use the Two Pointer technique.
Since the array is sorted, the largest square will come from either
the leftmost negative number or the rightmost positive number.
Compare absolute values from both ends and place the larger square
at the end of the result array.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
	public int[] sortedSquares(int[] nums) {
		int[] ans = new int[nums.length];

		int i = 0;
		int j = nums.length - 1;
		int k = nums.length - 1;

		while (k >= 0) {
			// Compare the absolute values at both ends and place the larger square last.
			if (Math.abs(nums[i]) > Math.abs(nums[j])) {
				ans[k--] = nums[i] * nums[i];
				i++;
			} else {
				ans[k--] = nums[j] * nums[j];
				j--;
			}
		}

		return ans;
	}
}
public class 02_Squares_Of_A_Sorted_Array {
    
}
