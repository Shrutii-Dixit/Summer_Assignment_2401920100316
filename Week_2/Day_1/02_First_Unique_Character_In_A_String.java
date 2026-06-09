/*
LeetCode Problem: First Unique Character in a String (#387)
Language: Java
Week: 2
Day: 1

Approach:
Use a frequency array of size 26 to count occurrences of each character.
In the first pass, store the frequency of every character.
In the second pass, find the first character whose frequency is exactly one
and return its index.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
	public int firstUniqChar(String s) {
		// Frequency array for lowercase English letters
		int[] freq = new int[26];
		int n = s.length();

		// First pass: count occurrences of each character
		for (int i = 0; i < n; i++) {
			freq[s.charAt(i) - 'a']++;
		}

		// Second pass: find the first character with frequency 1
		for (int i = 0; i < n; i++) {
			if (freq[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}

		// No unique character found
		return -1;
	}
}

