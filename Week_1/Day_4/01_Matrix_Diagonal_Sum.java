/*
LeetCode Problem: Matrix Diagonal Sum (#1572)
Language: Java
Week: 1
Day: 4

Approach:
Traverse the matrix once.
For each row, add the primary diagonal element.
Also add the secondary diagonal element.
If both diagonals meet at the same cell (center element in an odd-sized matrix),
count it only once.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
	public int diagonalSum(int[][] mat) {
		int n = mat.length;
		int sum = 0;

		// Iterate over each row (and corresponding columns for diagonals)
		for (int i = 0; i < n; i++) {
			// Primary diagonal element at (i, i)
			sum += mat[i][i];

			// Secondary diagonal column index for row i
			int j = n - 1 - i;

			// If primary and secondary diagonal refer to different cells,
			// include the secondary diagonal element as well.
			if (i != j) {
				sum += mat[i][j];
			}
		}

		return sum;
	}
}

