/*
LeetCode Problem: Reshape the Matrix (#566)
Language: Java
Week: 1
Day: 4

Approach:
Treat both matrices as a linear sequence of elements.
For each index in the virtual 1D representation:
1. Convert the index into row and column coordinates of the original matrix.
2. Convert the same index into row and column coordinates of the reshaped matrix.
3. Copy the value from the original position to the new position.

If the total number of elements does not match, return the original matrix.

Time Complexity: O(r × c)
Space Complexity: O(r × c)
*/

class Solution {
	public int[][] matrixReshape(int[][] mat, int r, int c) {

		// If total elements mismatch, reshaping is impossible — return original.
		if (mat.length * mat[0].length != r * c) {
			return mat;
		}

		// Prepare new matrix with target dimensions
		int[][] re_mat = new int[r][c];

		int n = r * c;             // total number of elements
		int t_c = mat[0].length;   // original matrix column count

		// Iterate over every element index in the flattened view
		for (int idx = 0; idx < n; idx++) {

			// Map flattened index to original matrix coordinates
			int r_o = idx / t_c;   // original row
			int c_o = idx % t_c;   // original column

			// Map flattened index to reshaped matrix coordinates
			int r_n = idx / c;     // new row
			int c_n = idx % c;     // new column

			// Copy element from original to reshaped position
			re_mat[r_n][c_n] = mat[r_o][c_o];
		}

		return re_mat;
	}
}

