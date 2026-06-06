/*
LeetCode Problem: Longest Common Prefix (#14)
Language: Java
Week: 1
Day: 5

Approach:
First determine the length of the shortest string.
Then compare characters column by column (vertical scanning).
For each position, check whether all strings contain the same character.
As soon as a mismatch is found, return the prefix formed so far.
If no mismatch occurs, the entire shortest string is the common prefix.

Time Complexity: O(n × m)
Space Complexity: O(1)
*/

class Solution {
	public String longestCommonPrefix(String[] strs) {
		int minLen = strs[0].length();

		// Find the shortest string length to limit the scan range.
		for (String str : strs) {
			minLen = Math.min(minLen, str.length());
		}

		int i = 0;

		while (i < minLen) {
			char ch = strs[0].charAt(i);

			// Compare the current column across every string.
			for (int j = 1; j < strs.length; j++) {
				char temp = strs[j].charAt(i);

				// Return the prefix built so far when a mismatch is found.
				if (ch != temp) {
					return strs[0].substring(0, i);
				}
			}

			i++;
		}

		// If all checked characters match, the shortest string is the answer.
		return strs[0].substring(0, minLen);
	}
}
