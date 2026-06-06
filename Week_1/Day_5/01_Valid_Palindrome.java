/*
LeetCode Problem: Valid Palindrome (#125)
Language: Java
Week: 1
Day: 5

Approach:
Use two pointers, one starting from the beginning and the other from the end.
Ignore all non-alphanumeric characters.
Compare valid characters after converting the string to lowercase.
If any mismatch is found, return false. Otherwise continue until both pointers meet.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
	public boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;

		s = s.toLowerCase();

		while (i <= j) {
			char first = s.charAt(i);
			char last = s.charAt(j);

			// Compare only when both characters are alphanumeric.
			if (Character.isLetterOrDigit(first) && Character.isLetterOrDigit(last)) {
				// A mismatch means the string is not a palindrome.
				if (first != last) {
					return false;
				}

				i++;
				j--;
			} else if (Character.isLetterOrDigit(first)) {
				// Skip the non-alphanumeric character on the right.
				j--;
			} else if (Character.isLetterOrDigit(last)) {
				// Skip the non-alphanumeric character on the left.
				i++;
			} else {
				// Skip non-alphanumeric characters on both sides.
				i++;
				j--;
			}
		}

		return true;
	}
}
