/*
LeetCode Problem: Spiral Matrix (#54)
Language: Java
Week: 1
Day: 4

Approach:
Use four boundaries: top, bottom, left, and right.

Traverse the matrix layer by layer:
1. Left to Right across the top row.
2. Top to Bottom along the right column.
3. Right to Left across the bottom row.
4. Bottom to Top along the left column.

After each traversal, shrink the corresponding boundary.
Continue until all elements are visited.

Time Complexity: O(m × n)
Space Complexity: O(1) extra space (excluding output list)
*/

import java.util.*;

class Solution {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> ans = new ArrayList<>();

		// Edge cases: empty matrix
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return ans;
		}

		int top = 0;
		int bottom = matrix.length - 1;
		int left = 0;
		int right = matrix[0].length - 1;

		// Continue until boundaries cross
		while (top <= bottom && left <= right) {

			// Traverse from Left -> Right across the top row
			for (int j = left; j <= right; j++) {
				ans.add(matrix[top][j]);
			}
			top++; // shrink top boundary

			// Traverse from Top -> Bottom along the right column
			for (int i = top; i <= bottom; i++) {
				ans.add(matrix[i][right]);
			}
			right--; // shrink right boundary

			// Traverse from Right -> Left across the bottom row, if still valid
			if (top <= bottom) {
				for (int j = right; j >= left; j--) {
					ans.add(matrix[bottom][j]);
				}
				bottom--; // shrink bottom boundary
			}

			// Traverse from Bottom -> Top along the left column, if still valid
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					ans.add(matrix[i][left]);
				}
				left++; // shrink left boundary
			}
		}

		return ans;
	}
}

