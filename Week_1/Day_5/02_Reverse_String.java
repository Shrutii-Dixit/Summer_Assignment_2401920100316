/*
LeetCode Problem: Reverse String (#344)
Language: Java
Week: 1
Day: 5

Approach:
Use two pointers, one at the beginning and one at the end of the character array.
Swap the characters at both pointers and move them toward each other until they meet.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
	public void reverseString(char[] s) {
		int i = 0;
		int j = s.length - 1;

		while (i < j) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;

			// Move both pointers inward after swapping.
			i++;
			j--;
		}
	}
}
