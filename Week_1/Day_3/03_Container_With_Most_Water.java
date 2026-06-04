/*
LeetCode Problem: Container With Most Water (#11)
Language: Java
Week: 1
Day: 3

Approach:
Use the Two Pointer technique.
Place one pointer at the beginning and one at the end of the array.
For each pair of lines, calculate the area formed using:
width × minimum height.
To maximize the area, move the pointer with the smaller height inward,
since the area is limited by the shorter line.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
	public int maxArea(int[] height) {
		int currArea = 0;
		int maxiArea = 0;
		int left = 0;
		int right = height.length - 1;

		while (left < right) {
			int indexDiff = right - left;
			int minHeight = Math.min(height[left], height[right]);

			currArea = indexDiff * minHeight;
			maxiArea = Math.max(maxiArea, currArea);

			// Move the shorter wall inward, since it limits the current area.
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}

		return maxiArea;
	}
}
